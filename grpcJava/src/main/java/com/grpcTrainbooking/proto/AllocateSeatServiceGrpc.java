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
public final class AllocateSeatServiceGrpc {

  private AllocateSeatServiceGrpc() {}

  public static final String SERVICE_NAME = "ticket_service.AllocateSeatService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpcTrainbooking.proto.AllocateSeatRequest,
      com.grpcTrainbooking.proto.AllocateSeatResponse> getAllocateSeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllocateSeat",
      requestType = com.grpcTrainbooking.proto.AllocateSeatRequest.class,
      responseType = com.grpcTrainbooking.proto.AllocateSeatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpcTrainbooking.proto.AllocateSeatRequest,
      com.grpcTrainbooking.proto.AllocateSeatResponse> getAllocateSeatMethod() {
    io.grpc.MethodDescriptor<com.grpcTrainbooking.proto.AllocateSeatRequest, com.grpcTrainbooking.proto.AllocateSeatResponse> getAllocateSeatMethod;
    if ((getAllocateSeatMethod = AllocateSeatServiceGrpc.getAllocateSeatMethod) == null) {
      synchronized (AllocateSeatServiceGrpc.class) {
        if ((getAllocateSeatMethod = AllocateSeatServiceGrpc.getAllocateSeatMethod) == null) {
          AllocateSeatServiceGrpc.getAllocateSeatMethod = getAllocateSeatMethod = 
              io.grpc.MethodDescriptor.<com.grpcTrainbooking.proto.AllocateSeatRequest, com.grpcTrainbooking.proto.AllocateSeatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ticket_service.AllocateSeatService", "AllocateSeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcTrainbooking.proto.AllocateSeatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcTrainbooking.proto.AllocateSeatResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AllocateSeatServiceMethodDescriptorSupplier("AllocateSeat"))
                  .build();
          }
        }
     }
     return getAllocateSeatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AllocateSeatServiceStub newStub(io.grpc.Channel channel) {
    return new AllocateSeatServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AllocateSeatServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AllocateSeatServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AllocateSeatServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AllocateSeatServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AllocateSeatServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void allocateSeat(com.grpcTrainbooking.proto.AllocateSeatRequest request,
        io.grpc.stub.StreamObserver<com.grpcTrainbooking.proto.AllocateSeatResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllocateSeatMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllocateSeatMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpcTrainbooking.proto.AllocateSeatRequest,
                com.grpcTrainbooking.proto.AllocateSeatResponse>(
                  this, METHODID_ALLOCATE_SEAT)))
          .build();
    }
  }

  /**
   */
  public static final class AllocateSeatServiceStub extends io.grpc.stub.AbstractStub<AllocateSeatServiceStub> {
    private AllocateSeatServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AllocateSeatServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AllocateSeatServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AllocateSeatServiceStub(channel, callOptions);
    }

    /**
     */
    public void allocateSeat(com.grpcTrainbooking.proto.AllocateSeatRequest request,
        io.grpc.stub.StreamObserver<com.grpcTrainbooking.proto.AllocateSeatResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllocateSeatMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AllocateSeatServiceBlockingStub extends io.grpc.stub.AbstractStub<AllocateSeatServiceBlockingStub> {
    private AllocateSeatServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AllocateSeatServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AllocateSeatServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AllocateSeatServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpcTrainbooking.proto.AllocateSeatResponse allocateSeat(com.grpcTrainbooking.proto.AllocateSeatRequest request) {
      return blockingUnaryCall(
          getChannel(), getAllocateSeatMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AllocateSeatServiceFutureStub extends io.grpc.stub.AbstractStub<AllocateSeatServiceFutureStub> {
    private AllocateSeatServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AllocateSeatServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AllocateSeatServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AllocateSeatServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpcTrainbooking.proto.AllocateSeatResponse> allocateSeat(
        com.grpcTrainbooking.proto.AllocateSeatRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAllocateSeatMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALLOCATE_SEAT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AllocateSeatServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AllocateSeatServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALLOCATE_SEAT:
          serviceImpl.allocateSeat((com.grpcTrainbooking.proto.AllocateSeatRequest) request,
              (io.grpc.stub.StreamObserver<com.grpcTrainbooking.proto.AllocateSeatResponse>) responseObserver);
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

  private static abstract class AllocateSeatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AllocateSeatServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpcTrainbooking.proto.Train.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AllocateSeatService");
    }
  }

  private static final class AllocateSeatServiceFileDescriptorSupplier
      extends AllocateSeatServiceBaseDescriptorSupplier {
    AllocateSeatServiceFileDescriptorSupplier() {}
  }

  private static final class AllocateSeatServiceMethodDescriptorSupplier
      extends AllocateSeatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AllocateSeatServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AllocateSeatServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AllocateSeatServiceFileDescriptorSupplier())
              .addMethod(getAllocateSeatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
