package com.grpcTrainbooking.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: train.proto")
public final class GetUsersBySectionServiceGrpc {

  private GetUsersBySectionServiceGrpc() {}

  public static final String SERVICE_NAME = "ticket_service.GetUsersBySectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpcTrainbooking.proto.GetUsersBySectionRequest,
      com.grpcTrainbooking.proto.GetUsersBySectionResponse> getGetUsersBySectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUsersBySection",
      requestType = com.grpcTrainbooking.proto.GetUsersBySectionRequest.class,
      responseType = com.grpcTrainbooking.proto.GetUsersBySectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpcTrainbooking.proto.GetUsersBySectionRequest,
      com.grpcTrainbooking.proto.GetUsersBySectionResponse> getGetUsersBySectionMethod() {
    io.grpc.MethodDescriptor<com.grpcTrainbooking.proto.GetUsersBySectionRequest, com.grpcTrainbooking.proto.GetUsersBySectionResponse> getGetUsersBySectionMethod;
    if ((getGetUsersBySectionMethod = GetUsersBySectionServiceGrpc.getGetUsersBySectionMethod) == null) {
      synchronized (GetUsersBySectionServiceGrpc.class) {
        if ((getGetUsersBySectionMethod = GetUsersBySectionServiceGrpc.getGetUsersBySectionMethod) == null) {
          GetUsersBySectionServiceGrpc.getGetUsersBySectionMethod = getGetUsersBySectionMethod = 
              io.grpc.MethodDescriptor.<com.grpcTrainbooking.proto.GetUsersBySectionRequest, com.grpcTrainbooking.proto.GetUsersBySectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ticket_service.GetUsersBySectionService", "GetUsersBySection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcTrainbooking.proto.GetUsersBySectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcTrainbooking.proto.GetUsersBySectionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GetUsersBySectionServiceMethodDescriptorSupplier("GetUsersBySection"))
                  .build();
          }
        }
     }
     return getGetUsersBySectionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetUsersBySectionServiceStub newStub(io.grpc.Channel channel) {
    return new GetUsersBySectionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetUsersBySectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GetUsersBySectionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetUsersBySectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GetUsersBySectionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GetUsersBySectionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUsersBySection(com.grpcTrainbooking.proto.GetUsersBySectionRequest request,
        io.grpc.stub.StreamObserver<com.grpcTrainbooking.proto.GetUsersBySectionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUsersBySectionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUsersBySectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpcTrainbooking.proto.GetUsersBySectionRequest,
                com.grpcTrainbooking.proto.GetUsersBySectionResponse>(
                  this, METHODID_GET_USERS_BY_SECTION)))
          .build();
    }
  }

  /**
   */
  public static final class GetUsersBySectionServiceStub extends io.grpc.stub.AbstractStub<GetUsersBySectionServiceStub> {
    private GetUsersBySectionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetUsersBySectionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetUsersBySectionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetUsersBySectionServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUsersBySection(com.grpcTrainbooking.proto.GetUsersBySectionRequest request,
        io.grpc.stub.StreamObserver<com.grpcTrainbooking.proto.GetUsersBySectionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUsersBySectionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GetUsersBySectionServiceBlockingStub extends io.grpc.stub.AbstractStub<GetUsersBySectionServiceBlockingStub> {
    private GetUsersBySectionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetUsersBySectionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetUsersBySectionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetUsersBySectionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpcTrainbooking.proto.GetUsersBySectionResponse getUsersBySection(com.grpcTrainbooking.proto.GetUsersBySectionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUsersBySectionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GetUsersBySectionServiceFutureStub extends io.grpc.stub.AbstractStub<GetUsersBySectionServiceFutureStub> {
    private GetUsersBySectionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetUsersBySectionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetUsersBySectionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetUsersBySectionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpcTrainbooking.proto.GetUsersBySectionResponse> getUsersBySection(
        com.grpcTrainbooking.proto.GetUsersBySectionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUsersBySectionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USERS_BY_SECTION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GetUsersBySectionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GetUsersBySectionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USERS_BY_SECTION:
          serviceImpl.getUsersBySection((com.grpcTrainbooking.proto.GetUsersBySectionRequest) request,
              (io.grpc.stub.StreamObserver<com.grpcTrainbooking.proto.GetUsersBySectionResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GetUsersBySectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GetUsersBySectionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpcTrainbooking.proto.Train.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GetUsersBySectionService");
    }
  }

  private static final class GetUsersBySectionServiceFileDescriptorSupplier
      extends GetUsersBySectionServiceBaseDescriptorSupplier {
    GetUsersBySectionServiceFileDescriptorSupplier() {}
  }

  private static final class GetUsersBySectionServiceMethodDescriptorSupplier
      extends GetUsersBySectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GetUsersBySectionServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GetUsersBySectionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetUsersBySectionServiceFileDescriptorSupplier())
              .addMethod(getGetUsersBySectionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
