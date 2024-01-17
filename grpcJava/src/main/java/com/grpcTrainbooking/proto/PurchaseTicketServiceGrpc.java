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
 * <pre>
 * Service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: train.proto")
public final class PurchaseTicketServiceGrpc {

  private PurchaseTicketServiceGrpc() {}

  public static final String SERVICE_NAME = "ticket_service.PurchaseTicketService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpcTrainbooking.proto.PurchaseRequest,
      com.grpcTrainbooking.proto.PurchaseResponse> getPurchaseTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PurchaseTicket",
      requestType = com.grpcTrainbooking.proto.PurchaseRequest.class,
      responseType = com.grpcTrainbooking.proto.PurchaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpcTrainbooking.proto.PurchaseRequest,
      com.grpcTrainbooking.proto.PurchaseResponse> getPurchaseTicketMethod() {
    io.grpc.MethodDescriptor<com.grpcTrainbooking.proto.PurchaseRequest, com.grpcTrainbooking.proto.PurchaseResponse> getPurchaseTicketMethod;
    if ((getPurchaseTicketMethod = PurchaseTicketServiceGrpc.getPurchaseTicketMethod) == null) {
      synchronized (PurchaseTicketServiceGrpc.class) {
        if ((getPurchaseTicketMethod = PurchaseTicketServiceGrpc.getPurchaseTicketMethod) == null) {
          PurchaseTicketServiceGrpc.getPurchaseTicketMethod = getPurchaseTicketMethod = 
              io.grpc.MethodDescriptor.<com.grpcTrainbooking.proto.PurchaseRequest, com.grpcTrainbooking.proto.PurchaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ticket_service.PurchaseTicketService", "PurchaseTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcTrainbooking.proto.PurchaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcTrainbooking.proto.PurchaseResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PurchaseTicketServiceMethodDescriptorSupplier("PurchaseTicket"))
                  .build();
          }
        }
     }
     return getPurchaseTicketMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PurchaseTicketServiceStub newStub(io.grpc.Channel channel) {
    return new PurchaseTicketServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PurchaseTicketServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PurchaseTicketServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PurchaseTicketServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PurchaseTicketServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public static abstract class PurchaseTicketServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void purchaseTicket(com.grpcTrainbooking.proto.PurchaseRequest request,
        io.grpc.stub.StreamObserver<com.grpcTrainbooking.proto.PurchaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPurchaseTicketMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPurchaseTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpcTrainbooking.proto.PurchaseRequest,
                com.grpcTrainbooking.proto.PurchaseResponse>(
                  this, METHODID_PURCHASE_TICKET)))
          .build();
    }
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class PurchaseTicketServiceStub extends io.grpc.stub.AbstractStub<PurchaseTicketServiceStub> {
    private PurchaseTicketServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PurchaseTicketServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PurchaseTicketServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PurchaseTicketServiceStub(channel, callOptions);
    }

    /**
     */
    public void purchaseTicket(com.grpcTrainbooking.proto.PurchaseRequest request,
        io.grpc.stub.StreamObserver<com.grpcTrainbooking.proto.PurchaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPurchaseTicketMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class PurchaseTicketServiceBlockingStub extends io.grpc.stub.AbstractStub<PurchaseTicketServiceBlockingStub> {
    private PurchaseTicketServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PurchaseTicketServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PurchaseTicketServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PurchaseTicketServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpcTrainbooking.proto.PurchaseResponse purchaseTicket(com.grpcTrainbooking.proto.PurchaseRequest request) {
      return blockingUnaryCall(
          getChannel(), getPurchaseTicketMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class PurchaseTicketServiceFutureStub extends io.grpc.stub.AbstractStub<PurchaseTicketServiceFutureStub> {
    private PurchaseTicketServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PurchaseTicketServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PurchaseTicketServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PurchaseTicketServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpcTrainbooking.proto.PurchaseResponse> purchaseTicket(
        com.grpcTrainbooking.proto.PurchaseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPurchaseTicketMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PURCHASE_TICKET = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PurchaseTicketServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PurchaseTicketServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PURCHASE_TICKET:
          serviceImpl.purchaseTicket((com.grpcTrainbooking.proto.PurchaseRequest) request,
              (io.grpc.stub.StreamObserver<com.grpcTrainbooking.proto.PurchaseResponse>) responseObserver);
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

  private static abstract class PurchaseTicketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PurchaseTicketServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpcTrainbooking.proto.Train.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PurchaseTicketService");
    }
  }

  private static final class PurchaseTicketServiceFileDescriptorSupplier
      extends PurchaseTicketServiceBaseDescriptorSupplier {
    PurchaseTicketServiceFileDescriptorSupplier() {}
  }

  private static final class PurchaseTicketServiceMethodDescriptorSupplier
      extends PurchaseTicketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PurchaseTicketServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PurchaseTicketServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PurchaseTicketServiceFileDescriptorSupplier())
              .addMethod(getPurchaseTicketMethod())
              .build();
        }
      }
    }
    return result;
  }
}
