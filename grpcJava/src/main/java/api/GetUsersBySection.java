package api;

import java.util.ArrayList;
import java.util.List;

import com.grpcTrainbooking.proto.Receipt;
import com.grpcTrainbooking.proto.GetUsersBySectionRequest;
import com.grpcTrainbooking.proto.GetUsersBySectionResponse;
import com.grpcTrainbooking.proto.GetUsersBySectionServiceGrpc.GetUsersBySectionServiceImplBase;
import data.TicketData;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class GetUsersBySection extends GetUsersBySectionServiceImplBase {
	
	private TicketData ticketData = TicketData.getInstance();
	
	public void getUsersBySection(GetUsersBySectionRequest request, StreamObserver<GetUsersBySectionResponse> responseObserver) {
        // Validate the request
        if (request == null || request.getSection().isEmpty()) {
            responseObserver.onError(Status.INVALID_ARGUMENT
                    .withDescription("Invalid request: Section cannot be empty")
                    .asRuntimeException());
            return;
        }

        // Initialize a list to store UserSeatInfo for the requested section
        List<Receipt> usersBySection = new ArrayList<>();

        // Iterate through stored tickets and collect users with the requested section
        for (Receipt receiptInfo : ticketData.userInfo.values()) {
            if (receiptInfo.getSeat().getSection().equals(request.getSection())) {
                usersBySection.add(receiptInfo);
            }
        }

        // Create a GetUsersBySectionResponse
        GetUsersBySectionResponse getUsersBySectionResponse = GetUsersBySectionResponse.newBuilder()
                .addAllUserInfo(usersBySection)
                .build();

        // Send the response back to the client
        responseObserver.onNext(getUsersBySectionResponse);
        responseObserver.onCompleted();
    }
	
}