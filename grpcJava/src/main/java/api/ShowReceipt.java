package api;

import com.grpcTrainbooking.proto.Receipt;
import com.grpcTrainbooking.proto.ShowReceiptRequest;
import com.grpcTrainbooking.proto.ShowReceiptResponse;
import com.grpcTrainbooking.proto.ShowReceiptServiceGrpc.ShowReceiptServiceImplBase;
import data.TicketData;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class ShowReceipt extends ShowReceiptServiceImplBase {
	
	private TicketData ticketData = TicketData.getInstance();
	
	public void showReceipt(ShowReceiptRequest request, StreamObserver<ShowReceiptResponse> responseObserver) {
        // Validate the request
        if (request == null || request.getEmail().isEmpty()) {
            responseObserver.onError(Status.INVALID_ARGUMENT
                    .withDescription("Invalid request: Email cannot be empty")
                    .asRuntimeException());
            return;
        }

        // Retrieve the purchase response based on the user's email
        Receipt receiptInfo = ticketData.userInfo.get(request.getEmail());
        if (receiptInfo == null) {
            responseObserver.onError(Status.NOT_FOUND
                    .withDescription("Purchase not found for the provided email")
                    .asRuntimeException());
            return;
        }

        // Check if the section and seat number are allocated for the user
        if (receiptInfo.getSeat().getSection().isEmpty() && receiptInfo.getSeat().getSeatNumber() == 0) {
            responseObserver.onError(Status.FAILED_PRECONDITION
                    .withDescription("No section and seat number allocated for the user with email: " + request.getEmail())
                    .asRuntimeException());
            return;
        }

        ShowReceiptResponse showReceiptResponse = ShowReceiptResponse.newBuilder()
                .setUserInfo(receiptInfo)
                .build();

        responseObserver.onNext(showReceiptResponse);
        responseObserver.onCompleted();
    }
}