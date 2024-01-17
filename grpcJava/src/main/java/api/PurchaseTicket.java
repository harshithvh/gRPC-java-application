package api;

import com.grpcTrainbooking.proto.PurchaseRequest;
import com.grpcTrainbooking.proto.PurchaseResponse;
import com.grpcTrainbooking.proto.Receipt;
import com.grpcTrainbooking.proto.Seat;
import com.grpcTrainbooking.proto.PurchaseTicketServiceGrpc.PurchaseTicketServiceImplBase;
import data.TicketData;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import java.util.UUID;

public class PurchaseTicket extends PurchaseTicketServiceImplBase {

	private TicketData ticketData = TicketData.getInstance();

    public void purchaseTicket(PurchaseRequest request, StreamObserver<PurchaseResponse> responseObserver) {
        // Validate the request
        if (request == null || request.getUser() == null ||
                request.getUser().getEmail().isEmpty() ||
                request.getUser().getFirstName().isEmpty() ||
                request.getUser().getLastName().isEmpty()) {
            responseObserver.onError(Status.INVALID_ARGUMENT
                    .withDescription("Invalid request: First name, last name, and email cannot be empty")
                    .asRuntimeException());
            return;
        }

        double price = 20.0;

        String purchaseID = UUID.randomUUID().toString();

        // Check if a ticket with the same email already exists
        if (ticketData.userInfo.containsKey(request.getUser().getEmail())) {
            responseObserver.onError(Status.ALREADY_EXISTS
                    .withDescription("Ticket already purchased for the provided email: " + request.getUser().getEmail())
                    .asRuntimeException());
            return;
        }

        // Create a PurchaseResponse
        PurchaseResponse purchaseResponse = PurchaseResponse.newBuilder()
                .setFrom(request.getFrom())
                .setTo(request.getTo())
                .setUser(request.getUser())
                .setPricePaid(price)
                .setPurchaseId(purchaseID)
                .build();

        Receipt ticketInfo = Receipt.newBuilder()
                .setFrom(request.getFrom())
                .setTo(request.getTo())
                .setUser(request.getUser())
                .setPricePaid((float) price)
                .setPurchaseId(purchaseID)
                .setSeat(Seat.newBuilder().build()) // You might need to set appropriate values for the seat
                .build();

        // Store the purchaseResponse in the Server's in-memory storage
        ticketData.userInfo.put(request.getUser().getEmail(), ticketInfo);

        // Send the response back to the client
        responseObserver.onNext(purchaseResponse);
        responseObserver.onCompleted();
    }
}