package api;

import com.grpcTrainbooking.proto.Receipt;
import com.grpcTrainbooking.proto.RemoveUserRequest;
import com.grpcTrainbooking.proto.RemoveUserResponse;
import com.grpcTrainbooking.proto.RemoveUserServiceGrpc.RemoveUserServiceImplBase;
import data.TicketData;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class RemoveUser extends RemoveUserServiceImplBase {
	
	private TicketData ticketData = TicketData.getInstance();
	
	public void removeUser(RemoveUserRequest request, StreamObserver<RemoveUserResponse> responseObserver) {
        // Validate the request
        if (request == null || request.getEmail().isEmpty()) {
            responseObserver.onError(Status.INVALID_ARGUMENT
                    .withDescription("Invalid request: Email cannot be empty")
                    .asRuntimeException());
            return;
        }

        // Check if the user exists in the stored tickets
        Receipt purchaseResponse = ticketData.userInfo.get(request.getEmail());
        if (purchaseResponse == null) {
            responseObserver.onError(Status.NOT_FOUND
                    .withDescription("User removed or not present")
                    .asRuntimeException());
            return;
        }

        // Mark the current seat and seat number as available
        boolean[] currSeat;

        if (purchaseResponse.getSeat().getSection().equals("A")) {
            currSeat = ticketData.seatAvailabilityA;
        } else {
            currSeat = ticketData.seatAvailabilityB;
        }

        int currentSeatNumber = purchaseResponse.getSeat().getSeatNumber();
        currSeat[currentSeatNumber - 1] = false;

        // Remove the user from the stored tickets
        ticketData.userInfo.remove(request.getEmail());

        // Create a RemoveUserResponse indicating success
        RemoveUserResponse removeUserResponse = RemoveUserResponse.newBuilder()
                .setRes("User removed successfully")
                .build();

        // Send the response back to the client
        responseObserver.onNext(removeUserResponse);
        responseObserver.onCompleted();
    }

}