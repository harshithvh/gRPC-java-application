package api;

import com.grpcTrainbooking.proto.ModifySeatRequest;
import com.grpcTrainbooking.proto.ModifySeatResponse;
import com.grpcTrainbooking.proto.ModifySeatServiceGrpc.ModifySeatServiceImplBase;
import com.grpcTrainbooking.proto.Receipt;
import com.grpcTrainbooking.proto.Seat;
import data.TicketData;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class ModifySeat extends ModifySeatServiceImplBase {
	
	private TicketData ticketData = TicketData.getInstance();
	
	public void modifySeat(ModifySeatRequest request, StreamObserver<ModifySeatResponse> responseObserver) {
        // Validate the request
        if (request == null || request.getEmail().isEmpty() || request.getNewSection().isEmpty()) {
            responseObserver.onError(Status.INVALID_ARGUMENT
                    .withDescription("Invalid request: Email and new section cannot be empty")
                    .asRuntimeException());
            return;
        }

        // Check if a purchase for the given email exists
        Receipt purchaseResponse = ticketData.userInfo.get(request.getEmail());
        if (purchaseResponse == null) {
            responseObserver.onError(Status.NOT_FOUND
                    .withDescription("No purchase found for the provided email")
                    .asRuntimeException());
            return;
        }

        // Check if the requested new seat number is within the valid range (1 to 10)
        int newSeatNumber = request.getNewSeatNumber();
        if (newSeatNumber < 1 || newSeatNumber > 10) {
            responseObserver.onError(Status.INVALID_ARGUMENT
                    .withDescription("Invalid new seat number. Must be between 1 and 10")
                    .asRuntimeException());
            return;
        }

        String section = request.getNewSection();

        boolean[] seatAvailability;
        if ("A".equals(section)) {
            seatAvailability = ticketData.seatAvailabilityA;
        } else if ("B".equals(section)) {
            seatAvailability = ticketData.seatAvailabilityB;
        } else {
            responseObserver.onError(Status.INVALID_ARGUMENT
                    .withDescription("Invalid new section: " + section)
                    .asRuntimeException());
            return;
        }

        if (seatAvailability[newSeatNumber - 1]) {
            responseObserver.onError(Status.RESOURCE_EXHAUSTED
                    .withDescription("Requested seat is not available in the specified section")
                    .asRuntimeException());
            return;
        }

        // Mark the current seat and seat number as available
        boolean[] currSeat;
        if ("A".equals(purchaseResponse.getSeat().getSection())) {
            currSeat = ticketData.seatAvailabilityA;
        } else {
            currSeat = ticketData.seatAvailabilityB;
        }

        int currentSeatNumber = purchaseResponse.getSeat().getSeatNumber();
        currSeat[currentSeatNumber - 1] = false;

        // Mark the new seat and seat number as unavailable
        seatAvailability[newSeatNumber - 1] = true;

        // Update the section and seat number in the purchase response        
        Receipt updatepurchaseResponse = Receipt.newBuilder()
                .setFrom(purchaseResponse.getFrom())
                .setTo(purchaseResponse.getTo())
                .setUser(purchaseResponse.getUser())
                .setPricePaid(purchaseResponse.getPricePaid())
                .setPurchaseId(purchaseResponse.getPurchaseId())
                .setSeat(Seat.newBuilder()
                        .setSection(section)
                        .setSeatNumber(newSeatNumber)
                        .build()) // You might need to set appropriate values for the seat
                .build();

        TicketData.getInstance().getUserInfo().put(request.getEmail(), updatepurchaseResponse);

        // Create a ModifySeatResponse indicating success
        ModifySeatResponse modifySeatResponse = ModifySeatResponse.newBuilder()
                .setRes("Seat modified successfully")
                .build();

        // Send the response back to the client
        responseObserver.onNext(modifySeatResponse);
        responseObserver.onCompleted();
    }
	
}