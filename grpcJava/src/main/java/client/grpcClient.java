package client;

import com.grpcTrainbooking.proto.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class grpcClient {

    public static void main(String[] args) {
        // Connect to the gRPC server
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        PurchaseTicketServiceGrpc.PurchaseTicketServiceBlockingStub ticketStub = PurchaseTicketServiceGrpc.newBlockingStub(channel);
        
        AllocateSeatServiceGrpc.AllocateSeatServiceBlockingStub allocateSeatStub = AllocateSeatServiceGrpc.newBlockingStub(channel);
        
        ShowReceiptServiceGrpc.ShowReceiptServiceBlockingStub receiptStub = ShowReceiptServiceGrpc.newBlockingStub(channel);
        
        GetUsersBySectionServiceGrpc.GetUsersBySectionServiceBlockingStub sectionStub = GetUsersBySectionServiceGrpc.newBlockingStub(channel);
        
        RemoveUserServiceGrpc.RemoveUserServiceBlockingStub removeUserStub = RemoveUserServiceGrpc.newBlockingStub(channel);
        
        ModifySeatServiceGrpc.ModifySeatServiceBlockingStub modifySeatStub = ModifySeatServiceGrpc.newBlockingStub(channel);

        purchaseTicket(ticketStub);
        
        allocateSeat(allocateSeatStub);
        
        showReceipt(receiptStub);
        
        getUsersBySection(sectionStub);
        
        removeUser(removeUserStub);
        
        modifySeat(modifySeatStub);

        channel.shutdown();
    }

    private static void purchaseTicket(PurchaseTicketServiceGrpc.PurchaseTicketServiceBlockingStub stub) {
    	
        PurchaseRequest purchaseRequest = PurchaseRequest.newBuilder()
                .setFrom("London")
                .setTo("France")
                .setUser(User.newBuilder().setFirstName("John").setLastName("Doe").setEmail("john.doe@example.com").build())
                .build();
        
        try {
        	
        	PurchaseResponse purchaseResponse = stub.purchaseTicket(purchaseRequest);
        	
        	System.out.println("Purchase ID: " + purchaseResponse.getPurchaseId());
            System.out.println("Price Paid: " + purchaseResponse.getPricePaid());
            
        } catch (StatusRuntimeException e) {
            System.err.println("Error calling PurchaseTicket: " + e.getStatus());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        
        
    }
    
    private static void allocateSeat(AllocateSeatServiceGrpc.AllocateSeatServiceBlockingStub stub) {

    	AllocateSeatRequest allocateSeatRequest = AllocateSeatRequest.newBuilder()
                .setEmail("john.doe@example.com")
                .setSection("A")
                .build();
        
        try {
        	
        	AllocateSeatResponse allocateSeatResponse = stub.allocateSeat(allocateSeatRequest);
        	
            System.out.println("Seat Allocated: " + allocateSeatResponse.getSection() + " - " + allocateSeatResponse.getSeatNumber());

        } catch (StatusRuntimeException e) {
            System.err.println("Error calling AllocateSeat: " + e.getStatus());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        
    }
    
    private static void showReceipt(ShowReceiptServiceGrpc.ShowReceiptServiceBlockingStub stub) {
        ShowReceiptRequest showReceiptRequest = ShowReceiptRequest.newBuilder()
                .setEmail("john.doe@example.com")
                .build();

        try {
            ShowReceiptResponse receiptResponse = stub.showReceipt(showReceiptRequest);
            System.out.println("Receipt : " + receiptResponse.getUserInfo().getPurchaseId());
        } catch (StatusRuntimeException e) {
            System.err.println("Error calling ShowReceipt: " + e.getStatus());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    private static void getUsersBySection(GetUsersBySectionServiceGrpc.GetUsersBySectionServiceBlockingStub stub) {
        GetUsersBySectionRequest getUsersBySectionRequest = GetUsersBySectionRequest.newBuilder()
                .setSection("A")
                .build();

        try {
            GetUsersBySectionResponse usersBySectionResponse = stub.getUsersBySection(getUsersBySectionRequest);

            System.out.println("UsersBySection: ");
            for (Receipt userReceipt : usersBySectionResponse.getUserInfoList()) {
            	System.out.println("User Email: " + userReceipt.getUser().getEmail());
                System.out.println("Purchase ID: " + userReceipt.getPurchaseId());
            }

        } catch (StatusRuntimeException e) {
            System.err.println("Error calling GetUsersBySection: " + e.getStatus());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    private static void removeUser(RemoveUserServiceGrpc.RemoveUserServiceBlockingStub stub) {
        RemoveUserRequest removeUserRequest = RemoveUserRequest.newBuilder()
                .setEmail("john.doe@example.com")
                .build();

        try {
            RemoveUserResponse removeUserResponse = stub.removeUser(removeUserRequest);
            System.out.println("RemoveUser Response: " + removeUserResponse.getRes());
        } catch (StatusRuntimeException e) {
            System.err.println("Error calling RemoveUser: " + e.getStatus());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    private static void modifySeat(ModifySeatServiceGrpc.ModifySeatServiceBlockingStub stub) {
        ModifySeatRequest modifySeatRequest = ModifySeatRequest.newBuilder()
                .setEmail("john.doe@example.com")
                .setNewSection("B")
                .setNewSeatNumber(5)
                .build();

        try {
            ModifySeatResponse modifySeatResponse = stub.modifySeat(modifySeatRequest);
            System.out.println("ModifySeat Response: " + modifySeatResponse.getRes());
        } catch (StatusRuntimeException e) {
            System.err.println("Error calling ModifySeat: " + e.getStatus());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}
