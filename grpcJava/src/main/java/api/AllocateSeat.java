package api;

import com.grpcTrainbooking.proto.AllocateSeatServiceGrpc.AllocateSeatServiceImplBase;
import com.grpcTrainbooking.proto.AllocateSeatRequest;
import com.grpcTrainbooking.proto.AllocateSeatResponse;
import com.grpcTrainbooking.proto.Seat;
import com.grpcTrainbooking.proto.Receipt;
import data.TicketData;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;


public class AllocateSeat extends AllocateSeatServiceImplBase {
	
	private TicketData ticketData = TicketData.getInstance();
	
	public void allocateSeat(AllocateSeatRequest request, StreamObserver<AllocateSeatResponse> responseObserver) {
        // Validate the request
        if (request == null || request.getEmail().isEmpty()) {
            responseObserver.onError(Status.INVALID_ARGUMENT
                    .withDescription("Invalid request")
                    .asRuntimeException());
            return;
        }

        Receipt purchaseInfo = ticketData.userInfo.get(request.getEmail());
        if (purchaseInfo == null) {
            responseObserver.onError(Status.NOT_FOUND
                    .withDescription("Purchase not found for the provided email: " + request.getEmail())
                    .asRuntimeException());
            return;
        }

        // Check if the seat is already allocated for the user
        if (!purchaseInfo.getSeat().getSection().isEmpty() && purchaseInfo.getSeat().getSeatNumber() > 0) {
            responseObserver.onError(Status.FAILED_PRECONDITION
                    .withDescription("Seat already allocated for the user with email: " + request.getEmail())
                    .asRuntimeException());
            return;
        }

        // Validate the new section
        if (request.getSection() == null || request.getSection().isEmpty()) {
            responseObserver.onError(Status.INVALID_ARGUMENT
                    .withDescription("Invalid request: Section cannot be empty")
                    .asRuntimeException());
            return;
        }

        if (!"A".equals(request.getSection()) && !"B".equals(request.getSection())) {
            responseObserver.onError(Status.INVALID_ARGUMENT
                    .withDescription("Invalid new section: " + request.getSection())
                    .asRuntimeException());
            return;
        }

        boolean[] seatAvailability;
        int seatNumber;

        switch (request.getSection()) {
            case "A":
                seatAvailability = TicketData.getInstance().getSeatAvailabilityA();
                int seatA = findNextAvailableSeat(seatAvailability);
                if (seatA == -1) {
                    responseObserver.onError(Status.RESOURCE_EXHAUSTED
                            .withDescription("No more seats available in section A")
                            .asRuntimeException());
                    return;
                }
                seatNumber = seatA;
                break;
            case "B":
                seatAvailability = TicketData.getInstance().getSeatAvailabilityB();
                int seatB = findNextAvailableSeat(seatAvailability);
                if (seatB == -1) {
                    responseObserver.onError(Status.RESOURCE_EXHAUSTED
                            .withDescription("No more seats available in section B")
                            .asRuntimeException());
                    return;
                }
                seatNumber = seatB;
                break;
            default:
                responseObserver.onError(Status.INVALID_ARGUMENT
                        .withDescription("Invalid section: " + request.getSection())
                        .asRuntimeException());
                return;
        }

        // Mark the seat as unavailable
        seatAvailability[seatNumber] = true;
        
        Receipt updatePurchaseInfo = Receipt.newBuilder()
                .setFrom(purchaseInfo.getFrom())
                .setTo(purchaseInfo.getTo())
                .setUser(purchaseInfo.getUser())
                .setPricePaid(purchaseInfo.getPricePaid())
                .setPurchaseId(purchaseInfo.getPurchaseId())
                .setSeat(Seat.newBuilder()
                        .setSection(request.getSection())
                        .setSeatNumber(seatNumber + 1)
                        .build())
                .build();

        TicketData.getInstance().getUserInfo().put(request.getEmail(), updatePurchaseInfo);

        AllocateSeatResponse allocateSeatResponse = AllocateSeatResponse.newBuilder()
                .setEmail(request.getEmail())
                .setSection(request.getSection())
                .setSeatNumber(seatNumber + 1)
                .build();

        responseObserver.onNext(allocateSeatResponse);
        responseObserver.onCompleted();
    }

    private int findNextAvailableSeat(boolean[] seatAvailability) {
        for (int i = 0; i < seatAvailability.length; i++) {
            if (!seatAvailability[i]) {
                return i;
            }
        }
        return -1;
    }
}
