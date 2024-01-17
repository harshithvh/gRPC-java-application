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
public final class ModifySeatServiceGrpc {

  private ModifySeatServiceGrpc() {}

  public static final String SERVICE_NAME = "ticket_service.ModifySeatService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpcTrainbooking.proto.ModifySeatRequest,
      com.grpcTrainbooking.proto.ModifySeatResponse> getModifySeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifySeat",
      requestType = com.grpcTrainbooking.proto.ModifySeatRequest.class,
      responseType = com.grpcTrainbooking.proto.ModifySeatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpcTrainbooking.proto.ModifySeatRequest,
      com.grpcTrainbooking.proto.ModifySeatResponse> getModifySeatMethod() {
    io.grpc.MethodDescriptor<com.grpcTrainbooking.proto.ModifySeatRequest, com.grpcTrainbooking.proto.ModifySeatResponse> getModifySeatMethod;
    if ((getModifySeatMethod = ModifySeatServiceGrpc.getModifySeatMethod) == null) {
      synchronized (ModifySeatServiceGrpc.class) {
        if ((getModifySeatMethod = ModifySeatServiceGrpc.getModifySeatMethod) == null) {
          ModifySeatServiceGrpc.getModifySeatMethod = getModifySeatMethod = 
              io.grpc.MethodDescriptor.<com.grpcTrainbooking.proto.ModifySeatRequest, com.grpcTrainbooking.proto.ModifySeatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ticket_service.ModifySeatService", "ModifySeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcTrainbooking.proto.ModifySeatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcTrainbooking.proto.ModifySeatResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ModifySeatServiceMethodDescriptorSupplier("ModifySeat"))
                  .build();
          }
        }
     }
     return getModifySeatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ModifySeatServiceStub newStub(io.grpc.Channel channel) {
    return new ModifySeatServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ModifySeatServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ModifySeatServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ModifySeatServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ModifySeatServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ModifySeatServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void modifySeat(com.grpcTrainbooking.proto.ModifySeatRequest request,
        io.grpc.stub.StreamObserver<com.grpcTrainbooking.proto.ModifySeatResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getModifySeatMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getModifySeatMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpcTrainbooking.proto.ModifySeatRequest,
                com.grpcTrainbooking.proto.ModifySeatResponse>(
                  this, METHODID_MODIFY_SEAT)))
          .build();
    }
  }

  /**
   */
  public static final class ModifySeatServiceStub extends io.grpc.stub.AbstractStub<ModifySeatServiceStub> {
    private ModifySeatServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ModifySeatServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModifySeatServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ModifySeatServiceStub(channel, callOptions);
    }

    /**
     */
    public void modifySeat(com.grpcTrainbooking.proto.ModifySeatRequest request,
        io.grpc.stub.StreamObserver<com.grpcTrainbooking.proto.ModifySeatResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getModifySeatMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ModifySeatServiceBlockingStub extends io.grpc.stub.AbstractStub<ModifySeatServiceBlockingStub> {
    private ModifySeatServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ModifySeatServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModifySeatServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ModifySeatServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpcTrainbooking.proto.ModifySeatResponse modifySeat(com.grpcTrainbooking.proto.ModifySeatRequest request) {
      return blockingUnaryCall(
          getChannel(), getModifySeatMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ModifySeatServiceFutureStub extends io.grpc.stub.AbstractStub<ModifySeatServiceFutureStub> {
    private ModifySeatServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ModifySeatServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModifySeatServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ModifySeatServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpcTrainbooking.proto.ModifySeatResponse> modifySeat(
        com.grpcTrainbooking.proto.ModifySeatRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getModifySeatMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MODIFY_SEAT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ModifySeatServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ModifySeatServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MODIFY_SEAT:
          serviceImpl.modifySeat((com.grpcTrainbooking.proto.ModifySeatRequest) request,
              (io.grpc.stub.StreamObserver<com.grpcTrainbooking.proto.ModifySeatResponse>) responseObserver);
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

  private static abstract class ModifySeatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ModifySeatServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpcTrainbooking.proto.Train.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ModifySeatService");
    }
  }

  private static final class ModifySeatServiceFileDescriptorSupplier
      extends ModifySeatServiceBaseDescriptorSupplier {
    ModifySeatServiceFileDescriptorSupplier() {}
  }

  private static final class ModifySeatServiceMethodDescriptorSupplier
      extends ModifySeatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ModifySeatServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ModifySeatServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ModifySeatServiceFileDescriptorSupplier())
              .addMethod(getModifySeatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
