// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: train.proto

package com.grpcTrainbooking.proto;

/**
 * Protobuf type {@code ticket_service.ShowReceiptResponse}
 */
public  final class ShowReceiptResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ticket_service.ShowReceiptResponse)
    ShowReceiptResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ShowReceiptResponse.newBuilder() to construct.
  private ShowReceiptResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShowReceiptResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ShowReceiptResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.grpcTrainbooking.proto.Receipt.Builder subBuilder = null;
            if (userInfo_ != null) {
              subBuilder = userInfo_.toBuilder();
            }
            userInfo_ = input.readMessage(com.grpcTrainbooking.proto.Receipt.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(userInfo_);
              userInfo_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpcTrainbooking.proto.Train.internal_static_ticket_service_ShowReceiptResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpcTrainbooking.proto.Train.internal_static_ticket_service_ShowReceiptResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpcTrainbooking.proto.ShowReceiptResponse.class, com.grpcTrainbooking.proto.ShowReceiptResponse.Builder.class);
  }

  public static final int USER_INFO_FIELD_NUMBER = 1;
  private com.grpcTrainbooking.proto.Receipt userInfo_;
  /**
   * <code>.ticket_service.Receipt user_info = 1;</code>
   */
  public boolean hasUserInfo() {
    return userInfo_ != null;
  }
  /**
   * <code>.ticket_service.Receipt user_info = 1;</code>
   */
  public com.grpcTrainbooking.proto.Receipt getUserInfo() {
    return userInfo_ == null ? com.grpcTrainbooking.proto.Receipt.getDefaultInstance() : userInfo_;
  }
  /**
   * <code>.ticket_service.Receipt user_info = 1;</code>
   */
  public com.grpcTrainbooking.proto.ReceiptOrBuilder getUserInfoOrBuilder() {
    return getUserInfo();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (userInfo_ != null) {
      output.writeMessage(1, getUserInfo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUserInfo());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.grpcTrainbooking.proto.ShowReceiptResponse)) {
      return super.equals(obj);
    }
    com.grpcTrainbooking.proto.ShowReceiptResponse other = (com.grpcTrainbooking.proto.ShowReceiptResponse) obj;

    boolean result = true;
    result = result && (hasUserInfo() == other.hasUserInfo());
    if (hasUserInfo()) {
      result = result && getUserInfo()
          .equals(other.getUserInfo());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasUserInfo()) {
      hash = (37 * hash) + USER_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getUserInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpcTrainbooking.proto.ShowReceiptResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpcTrainbooking.proto.ShowReceiptResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpcTrainbooking.proto.ShowReceiptResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpcTrainbooking.proto.ShowReceiptResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpcTrainbooking.proto.ShowReceiptResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpcTrainbooking.proto.ShowReceiptResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpcTrainbooking.proto.ShowReceiptResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpcTrainbooking.proto.ShowReceiptResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpcTrainbooking.proto.ShowReceiptResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpcTrainbooking.proto.ShowReceiptResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpcTrainbooking.proto.ShowReceiptResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpcTrainbooking.proto.ShowReceiptResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.grpcTrainbooking.proto.ShowReceiptResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ticket_service.ShowReceiptResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ticket_service.ShowReceiptResponse)
      com.grpcTrainbooking.proto.ShowReceiptResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpcTrainbooking.proto.Train.internal_static_ticket_service_ShowReceiptResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpcTrainbooking.proto.Train.internal_static_ticket_service_ShowReceiptResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpcTrainbooking.proto.ShowReceiptResponse.class, com.grpcTrainbooking.proto.ShowReceiptResponse.Builder.class);
    }

    // Construct using com.grpcTrainbooking.proto.ShowReceiptResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (userInfoBuilder_ == null) {
        userInfo_ = null;
      } else {
        userInfo_ = null;
        userInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpcTrainbooking.proto.Train.internal_static_ticket_service_ShowReceiptResponse_descriptor;
    }

    @java.lang.Override
    public com.grpcTrainbooking.proto.ShowReceiptResponse getDefaultInstanceForType() {
      return com.grpcTrainbooking.proto.ShowReceiptResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpcTrainbooking.proto.ShowReceiptResponse build() {
      com.grpcTrainbooking.proto.ShowReceiptResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpcTrainbooking.proto.ShowReceiptResponse buildPartial() {
      com.grpcTrainbooking.proto.ShowReceiptResponse result = new com.grpcTrainbooking.proto.ShowReceiptResponse(this);
      if (userInfoBuilder_ == null) {
        result.userInfo_ = userInfo_;
      } else {
        result.userInfo_ = userInfoBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.grpcTrainbooking.proto.ShowReceiptResponse) {
        return mergeFrom((com.grpcTrainbooking.proto.ShowReceiptResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpcTrainbooking.proto.ShowReceiptResponse other) {
      if (other == com.grpcTrainbooking.proto.ShowReceiptResponse.getDefaultInstance()) return this;
      if (other.hasUserInfo()) {
        mergeUserInfo(other.getUserInfo());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.grpcTrainbooking.proto.ShowReceiptResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpcTrainbooking.proto.ShowReceiptResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.grpcTrainbooking.proto.Receipt userInfo_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpcTrainbooking.proto.Receipt, com.grpcTrainbooking.proto.Receipt.Builder, com.grpcTrainbooking.proto.ReceiptOrBuilder> userInfoBuilder_;
    /**
     * <code>.ticket_service.Receipt user_info = 1;</code>
     */
    public boolean hasUserInfo() {
      return userInfoBuilder_ != null || userInfo_ != null;
    }
    /**
     * <code>.ticket_service.Receipt user_info = 1;</code>
     */
    public com.grpcTrainbooking.proto.Receipt getUserInfo() {
      if (userInfoBuilder_ == null) {
        return userInfo_ == null ? com.grpcTrainbooking.proto.Receipt.getDefaultInstance() : userInfo_;
      } else {
        return userInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.ticket_service.Receipt user_info = 1;</code>
     */
    public Builder setUserInfo(com.grpcTrainbooking.proto.Receipt value) {
      if (userInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userInfo_ = value;
        onChanged();
      } else {
        userInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ticket_service.Receipt user_info = 1;</code>
     */
    public Builder setUserInfo(
        com.grpcTrainbooking.proto.Receipt.Builder builderForValue) {
      if (userInfoBuilder_ == null) {
        userInfo_ = builderForValue.build();
        onChanged();
      } else {
        userInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ticket_service.Receipt user_info = 1;</code>
     */
    public Builder mergeUserInfo(com.grpcTrainbooking.proto.Receipt value) {
      if (userInfoBuilder_ == null) {
        if (userInfo_ != null) {
          userInfo_ =
            com.grpcTrainbooking.proto.Receipt.newBuilder(userInfo_).mergeFrom(value).buildPartial();
        } else {
          userInfo_ = value;
        }
        onChanged();
      } else {
        userInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ticket_service.Receipt user_info = 1;</code>
     */
    public Builder clearUserInfo() {
      if (userInfoBuilder_ == null) {
        userInfo_ = null;
        onChanged();
      } else {
        userInfo_ = null;
        userInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ticket_service.Receipt user_info = 1;</code>
     */
    public com.grpcTrainbooking.proto.Receipt.Builder getUserInfoBuilder() {
      
      onChanged();
      return getUserInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.ticket_service.Receipt user_info = 1;</code>
     */
    public com.grpcTrainbooking.proto.ReceiptOrBuilder getUserInfoOrBuilder() {
      if (userInfoBuilder_ != null) {
        return userInfoBuilder_.getMessageOrBuilder();
      } else {
        return userInfo_ == null ?
            com.grpcTrainbooking.proto.Receipt.getDefaultInstance() : userInfo_;
      }
    }
    /**
     * <code>.ticket_service.Receipt user_info = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpcTrainbooking.proto.Receipt, com.grpcTrainbooking.proto.Receipt.Builder, com.grpcTrainbooking.proto.ReceiptOrBuilder> 
        getUserInfoFieldBuilder() {
      if (userInfoBuilder_ == null) {
        userInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.grpcTrainbooking.proto.Receipt, com.grpcTrainbooking.proto.Receipt.Builder, com.grpcTrainbooking.proto.ReceiptOrBuilder>(
                getUserInfo(),
                getParentForChildren(),
                isClean());
        userInfo_ = null;
      }
      return userInfoBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ticket_service.ShowReceiptResponse)
  }

  // @@protoc_insertion_point(class_scope:ticket_service.ShowReceiptResponse)
  private static final com.grpcTrainbooking.proto.ShowReceiptResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpcTrainbooking.proto.ShowReceiptResponse();
  }

  public static com.grpcTrainbooking.proto.ShowReceiptResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShowReceiptResponse>
      PARSER = new com.google.protobuf.AbstractParser<ShowReceiptResponse>() {
    @java.lang.Override
    public ShowReceiptResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ShowReceiptResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ShowReceiptResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShowReceiptResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpcTrainbooking.proto.ShowReceiptResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

