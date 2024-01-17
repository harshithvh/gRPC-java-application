package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.grpcTrainbooking.proto.*;

public class grpcClient {

    public static void main(String[] args) {
        // Connect to the gRPC server
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        // Create a stub for the PurchaseTicket service
        PurchaseTicketServiceGrpc.PurchaseTicketServiceBlockingStub stub = PurchaseTicketServiceGrpc.newBlockingStub(channel);

        // Prepare a PurchaseRequest
        PurchaseRequest purchaseRequest = PurchaseRequest.newBuilder()
                .setFrom("London")
                .setTo("France")
                .setUser(User.newBuilder().setFirstName("John").setLastName("Doe").setEmail("john.doe@example.com").build())
                .build();

        // Call the PurchaseTicket API
        PurchaseResponse purchaseResponse = stub.purchaseTicket(purchaseRequest);

        // Print the response
        System.out.println("Purchase ID: " + purchaseResponse.getPurchaseId());
        System.out.println("Price Paid: " + purchaseResponse.getPricePaid());

        // Shutdown the channel
        channel.shutdown();
    }
}
