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
public final class ShowReceiptServiceGrpc {

  private ShowReceiptServiceGrpc() {}

  public static final String SERVICE_NAME = "ticket_service.ShowReceiptService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpcTrainbooking.proto.ShowReceiptRequest,
      com.grpcTrainbooking.proto.ShowReceiptResponse> getShowReceiptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShowReceipt",
      requestType = com.grpcTrainbooking.proto.ShowReceiptRequest.class,
      responseType = com.grpcTrainbooking.proto.ShowReceiptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpcTrainbooking.proto.ShowReceiptRequest,
      com.grpcTrainbooking.proto.ShowReceiptResponse> getShowReceiptMethod() {
    io.grpc.MethodDescriptor<com.grpcTrainbooking.proto.ShowReceiptRequest, com.grpcTrainbooking.proto.ShowReceiptResponse> getShowReceiptMethod;
    if ((getShowReceiptMethod = ShowReceiptServiceGrpc.getShowReceiptMethod) == null) {
      synchronized (ShowReceiptServiceGrpc.class) {
        if ((getShowReceiptMethod = ShowReceiptServiceGrpc.getShowReceiptMethod) == null) {
          ShowReceiptServiceGrpc.getShowReceiptMethod = getShowReceiptMethod = 
              io.grpc.MethodDescriptor.<com.grpcTrainbooking.proto.ShowReceiptRequest, com.grpcTrainbooking.proto.ShowReceiptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ticket_service.ShowReceiptService", "ShowReceipt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcTrainbooking.proto.ShowReceiptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcTrainbooking.proto.ShowReceiptResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ShowReceiptServiceMethodDescriptorSupplier("ShowReceipt"))
                  .build();
          }
        }
     }
     return getShowReceiptMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShowReceiptServiceStub newStub(io.grpc.Channel channel) {
    return new ShowReceiptServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShowReceiptServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ShowReceiptServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShowReceiptServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ShowReceiptServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ShowReceiptServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void showReceipt(com.grpcTrainbooking.proto.ShowReceiptRequest request,
        io.grpc.stub.StreamObserver<com.grpcTrainbooking.proto.ShowReceiptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowReceiptMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getShowReceiptMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpcTrainbooking.proto.ShowReceiptRequest,
                com.grpcTrainbooking.proto.ShowReceiptResponse>(
                  this, METHODID_SHOW_RECEIPT)))
          .build();
    }
  }

  /**
   */
  public static final class ShowReceiptServiceStub extends io.grpc.stub.AbstractStub<ShowReceiptServiceStub> {
    private ShowReceiptServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShowReceiptServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShowReceiptServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShowReceiptServiceStub(channel, callOptions);
    }

    /**
     */
    public void showReceipt(com.grpcTrainbooking.proto.ShowReceiptRequest request,
        io.grpc.stub.StreamObserver<com.grpcTrainbooking.proto.ShowReceiptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowReceiptMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ShowReceiptServiceBlockingStub extends io.grpc.stub.AbstractStub<ShowReceiptServiceBlockingStub> {
    private ShowReceiptServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShowReceiptServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShowReceiptServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShowReceiptServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpcTrainbooking.proto.ShowReceiptResponse showReceipt(com.grpcTrainbooking.proto.ShowReceiptRequest request) {
      return blockingUnaryCall(
          getChannel(), getShowReceiptMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ShowReceiptServiceFutureStub extends io.grpc.stub.AbstractStub<ShowReceiptServiceFutureStub> {
    private ShowReceiptServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShowReceiptServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShowReceiptServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShowReceiptServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpcTrainbooking.proto.ShowReceiptResponse> showReceipt(
        com.grpcTrainbooking.proto.ShowReceiptRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShowReceiptMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SHOW_RECEIPT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ShowReceiptServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ShowReceiptServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SHOW_RECEIPT:
          serviceImpl.showReceipt((com.grpcTrainbooking.proto.ShowReceiptRequest) request,
              (io.grpc.stub.StreamObserver<com.grpcTrainbooking.proto.ShowReceiptResponse>) responseObserver);
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

  private static abstract class ShowReceiptServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShowReceiptServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpcTrainbooking.proto.Train.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ShowReceiptService");
    }
  }

  private static final class ShowReceiptServiceFileDescriptorSupplier
      extends ShowReceiptServiceBaseDescriptorSupplier {
    ShowReceiptServiceFileDescriptorSupplier() {}
  }

  private static final class ShowReceiptServiceMethodDescriptorSupplier
      extends ShowReceiptServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ShowReceiptServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ShowReceiptServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShowReceiptServiceFileDescriptorSupplier())
              .addMethod(getShowReceiptMethod())
              .build();
        }
      }
    }
    return result;
  }
}
