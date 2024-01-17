// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: train.proto

package com.grpcTrainbooking.proto;

public final class Train {
  private Train() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ticket_service_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ticket_service_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ticket_service_Seat_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ticket_service_Seat_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ticket_service_Receipt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ticket_service_Receipt_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ticket_service_PurchaseRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ticket_service_PurchaseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ticket_service_PurchaseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ticket_service_PurchaseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ticket_service_AllocateSeatRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ticket_service_AllocateSeatRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ticket_service_AllocateSeatResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ticket_service_AllocateSeatResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ticket_service_ShowReceiptRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ticket_service_ShowReceiptRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ticket_service_ShowReceiptResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ticket_service_ShowReceiptResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ticket_service_GetUsersBySectionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ticket_service_GetUsersBySectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ticket_service_GetUsersBySectionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ticket_service_GetUsersBySectionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ticket_service_RemoveUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ticket_service_RemoveUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ticket_service_RemoveUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ticket_service_RemoveUserResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ticket_service_ModifySeatRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ticket_service_ModifySeatRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ticket_service_ModifySeatResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ticket_service_ModifySeatResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013train.proto\022\016ticket_service\"<\n\004User\022\022\n" +
      "\nfirst_name\030\001 \001(\t\022\021\n\tlast_name\030\002 \001(\t\022\r\n\005" +
      "email\030\003 \001(\t\",\n\004Seat\022\017\n\007section\030\001 \001(\t\022\023\n\013" +
      "seat_number\030\002 \001(\005\"\224\001\n\007Receipt\022\014\n\004from\030\001 " +
      "\001(\t\022\n\n\002to\030\002 \001(\t\022\"\n\004user\030\003 \001(\0132\024.ticket_s" +
      "ervice.User\022\"\n\004seat\030\004 \001(\0132\024.ticket_servi" +
      "ce.Seat\022\022\n\nprice_paid\030\005 \001(\002\022\023\n\013purchase_" +
      "id\030\006 \001(\t\"O\n\017PurchaseRequest\022\014\n\004from\030\001 \001(" +
      "\t\022\n\n\002to\030\002 \001(\t\022\"\n\004user\030\004 \001(\0132\024.ticket_ser" +
      "vice.User\"y\n\020PurchaseResponse\022\014\n\004from\030\001 " +
      "\001(\t\022\n\n\002to\030\002 \001(\t\022\"\n\004user\030\003 \001(\0132\024.ticket_s" +
      "ervice.User\022\022\n\nprice_paid\030\004 \001(\001\022\023\n\013purch" +
      "ase_id\030\005 \001(\t\"5\n\023AllocateSeatRequest\022\r\n\005e" +
      "mail\030\001 \001(\t\022\017\n\007section\030\002 \001(\t\"K\n\024AllocateS" +
      "eatResponse\022\r\n\005email\030\001 \001(\t\022\017\n\007section\030\002 " +
      "\001(\t\022\023\n\013seat_number\030\003 \001(\005\"#\n\022ShowReceiptR" +
      "equest\022\r\n\005email\030\001 \001(\t\"A\n\023ShowReceiptResp" +
      "onse\022*\n\tuser_info\030\001 \001(\0132\027.ticket_service" +
      ".Receipt\"+\n\030GetUsersBySectionRequest\022\017\n\007" +
      "section\030\001 \001(\t\"G\n\031GetUsersBySectionRespon" +
      "se\022*\n\tuser_info\030\001 \003(\0132\027.ticket_service.R" +
      "eceipt\"\"\n\021RemoveUserRequest\022\r\n\005email\030\001 \001" +
      "(\t\"!\n\022RemoveUserResponse\022\013\n\003res\030\001 \001(\t\"P\n" +
      "\021ModifySeatRequest\022\r\n\005email\030\001 \001(\t\022\023\n\013new" +
      "_section\030\002 \001(\t\022\027\n\017new_seat_number\030\003 \001(\005\"" +
      "!\n\022ModifySeatResponse\022\013\n\003res\030\001 \001(\t2n\n\025Pu" +
      "rchaseTicketService\022U\n\016PurchaseTicket\022\037." +
      "ticket_service.PurchaseRequest\032 .ticket_" +
      "service.PurchaseResponse\"\0002r\n\023AllocateSe" +
      "atService\022[\n\014AllocateSeat\022#.ticket_servi" +
      "ce.AllocateSeatRequest\032$.ticket_service." +
      "AllocateSeatResponse\"\0002n\n\022ShowReceiptSer" +
      "vice\022X\n\013ShowReceipt\022\".ticket_service.Sho" +
      "wReceiptRequest\032#.ticket_service.ShowRec" +
      "eiptResponse\"\0002\206\001\n\030GetUsersBySectionServ" +
      "ice\022j\n\021GetUsersBySection\022(.ticket_servic" +
      "e.GetUsersBySectionRequest\032).ticket_serv" +
      "ice.GetUsersBySectionResponse\"\0002j\n\021Remov" +
      "eUserService\022U\n\nRemoveUser\022!.ticket_serv" +
      "ice.RemoveUserRequest\032\".ticket_service.R" +
      "emoveUserResponse\"\0002j\n\021ModifySeatService" +
      "\022U\n\nModifySeat\022!.ticket_service.ModifySe" +
      "atRequest\032\".ticket_service.ModifySeatRes" +
      "ponse\"\000B\036\n\032com.grpcTrainbooking.protoP\001b" +
      "\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_ticket_service_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ticket_service_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ticket_service_User_descriptor,
        new java.lang.String[] { "FirstName", "LastName", "Email", });
    internal_static_ticket_service_Seat_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ticket_service_Seat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ticket_service_Seat_descriptor,
        new java.lang.String[] { "Section", "SeatNumber", });
    internal_static_ticket_service_Receipt_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ticket_service_Receipt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ticket_service_Receipt_descriptor,
        new java.lang.String[] { "From", "To", "User", "Seat", "PricePaid", "PurchaseId", });
    internal_static_ticket_service_PurchaseRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ticket_service_PurchaseRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ticket_service_PurchaseRequest_descriptor,
        new java.lang.String[] { "From", "To", "User", });
    internal_static_ticket_service_PurchaseResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ticket_service_PurchaseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ticket_service_PurchaseResponse_descriptor,
        new java.lang.String[] { "From", "To", "User", "PricePaid", "PurchaseId", });
    internal_static_ticket_service_AllocateSeatRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ticket_service_AllocateSeatRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ticket_service_AllocateSeatRequest_descriptor,
        new java.lang.String[] { "Email", "Section", });
    internal_static_ticket_service_AllocateSeatResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_ticket_service_AllocateSeatResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ticket_service_AllocateSeatResponse_descriptor,
        new java.lang.String[] { "Email", "Section", "SeatNumber", });
    internal_static_ticket_service_ShowReceiptRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_ticket_service_ShowReceiptRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ticket_service_ShowReceiptRequest_descriptor,
        new java.lang.String[] { "Email", });
    internal_static_ticket_service_ShowReceiptResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_ticket_service_ShowReceiptResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ticket_service_ShowReceiptResponse_descriptor,
        new java.lang.String[] { "UserInfo", });
    internal_static_ticket_service_GetUsersBySectionRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_ticket_service_GetUsersBySectionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ticket_service_GetUsersBySectionRequest_descriptor,
        new java.lang.String[] { "Section", });
    internal_static_ticket_service_GetUsersBySectionResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_ticket_service_GetUsersBySectionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ticket_service_GetUsersBySectionResponse_descriptor,
        new java.lang.String[] { "UserInfo", });
    internal_static_ticket_service_RemoveUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_ticket_service_RemoveUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ticket_service_RemoveUserRequest_descriptor,
        new java.lang.String[] { "Email", });
    internal_static_ticket_service_RemoveUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_ticket_service_RemoveUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ticket_service_RemoveUserResponse_descriptor,
        new java.lang.String[] { "Res", });
    internal_static_ticket_service_ModifySeatRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_ticket_service_ModifySeatRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ticket_service_ModifySeatRequest_descriptor,
        new java.lang.String[] { "Email", "NewSection", "NewSeatNumber", });
    internal_static_ticket_service_ModifySeatResponse_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_ticket_service_ModifySeatResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ticket_service_ModifySeatResponse_descriptor,
        new java.lang.String[] { "Res", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}