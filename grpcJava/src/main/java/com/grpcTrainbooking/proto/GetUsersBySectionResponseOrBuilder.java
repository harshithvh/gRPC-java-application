// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: train.proto

package com.grpcTrainbooking.proto;

public interface GetUsersBySectionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ticket_service.GetUsersBySectionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .ticket_service.Receipt user_info = 1;</code>
   */
  java.util.List<com.grpcTrainbooking.proto.Receipt> 
      getUserInfoList();
  /**
   * <code>repeated .ticket_service.Receipt user_info = 1;</code>
   */
  com.grpcTrainbooking.proto.Receipt getUserInfo(int index);
  /**
   * <code>repeated .ticket_service.Receipt user_info = 1;</code>
   */
  int getUserInfoCount();
  /**
   * <code>repeated .ticket_service.Receipt user_info = 1;</code>
   */
  java.util.List<? extends com.grpcTrainbooking.proto.ReceiptOrBuilder> 
      getUserInfoOrBuilderList();
  /**
   * <code>repeated .ticket_service.Receipt user_info = 1;</code>
   */
  com.grpcTrainbooking.proto.ReceiptOrBuilder getUserInfoOrBuilder(
      int index);
}
