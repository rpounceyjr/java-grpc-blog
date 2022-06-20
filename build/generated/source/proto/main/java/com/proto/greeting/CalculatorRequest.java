// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator/calculator.proto

package com.proto.greeting;

/**
 * Protobuf type {@code greeting.CalculatorRequest}
 */
public final class CalculatorRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:greeting.CalculatorRequest)
    CalculatorRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CalculatorRequest.newBuilder() to construct.
  private CalculatorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CalculatorRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CalculatorRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CalculatorRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            firstNum_ = input.readInt32();
            break;
          }
          case 16: {

            secondNum_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return com.proto.greeting.Calculator.internal_static_greeting_CalculatorRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.greeting.Calculator.internal_static_greeting_CalculatorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.greeting.CalculatorRequest.class, com.proto.greeting.CalculatorRequest.Builder.class);
  }

  public static final int FIRST_NUM_FIELD_NUMBER = 1;
  private int firstNum_;
  /**
   * <code>int32 first_num = 1;</code>
   * @return The firstNum.
   */
  @java.lang.Override
  public int getFirstNum() {
    return firstNum_;
  }

  public static final int SECOND_NUM_FIELD_NUMBER = 2;
  private int secondNum_;
  /**
   * <code>int32 second_num = 2;</code>
   * @return The secondNum.
   */
  @java.lang.Override
  public int getSecondNum() {
    return secondNum_;
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
    if (firstNum_ != 0) {
      output.writeInt32(1, firstNum_);
    }
    if (secondNum_ != 0) {
      output.writeInt32(2, secondNum_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (firstNum_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, firstNum_);
    }
    if (secondNum_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, secondNum_);
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
    if (!(obj instanceof com.proto.greeting.CalculatorRequest)) {
      return super.equals(obj);
    }
    com.proto.greeting.CalculatorRequest other = (com.proto.greeting.CalculatorRequest) obj;

    if (getFirstNum()
        != other.getFirstNum()) return false;
    if (getSecondNum()
        != other.getSecondNum()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FIRST_NUM_FIELD_NUMBER;
    hash = (53 * hash) + getFirstNum();
    hash = (37 * hash) + SECOND_NUM_FIELD_NUMBER;
    hash = (53 * hash) + getSecondNum();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.greeting.CalculatorRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.greeting.CalculatorRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.greeting.CalculatorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.greeting.CalculatorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.greeting.CalculatorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.greeting.CalculatorRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.greeting.CalculatorRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.greeting.CalculatorRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.greeting.CalculatorRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.greeting.CalculatorRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.greeting.CalculatorRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.greeting.CalculatorRequest parseFrom(
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
  public static Builder newBuilder(com.proto.greeting.CalculatorRequest prototype) {
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
   * Protobuf type {@code greeting.CalculatorRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:greeting.CalculatorRequest)
      com.proto.greeting.CalculatorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.greeting.Calculator.internal_static_greeting_CalculatorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.greeting.Calculator.internal_static_greeting_CalculatorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.greeting.CalculatorRequest.class, com.proto.greeting.CalculatorRequest.Builder.class);
    }

    // Construct using com.proto.greeting.CalculatorRequest.newBuilder()
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
      firstNum_ = 0;

      secondNum_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.greeting.Calculator.internal_static_greeting_CalculatorRequest_descriptor;
    }

    @java.lang.Override
    public com.proto.greeting.CalculatorRequest getDefaultInstanceForType() {
      return com.proto.greeting.CalculatorRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.greeting.CalculatorRequest build() {
      com.proto.greeting.CalculatorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.greeting.CalculatorRequest buildPartial() {
      com.proto.greeting.CalculatorRequest result = new com.proto.greeting.CalculatorRequest(this);
      result.firstNum_ = firstNum_;
      result.secondNum_ = secondNum_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.proto.greeting.CalculatorRequest) {
        return mergeFrom((com.proto.greeting.CalculatorRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.greeting.CalculatorRequest other) {
      if (other == com.proto.greeting.CalculatorRequest.getDefaultInstance()) return this;
      if (other.getFirstNum() != 0) {
        setFirstNum(other.getFirstNum());
      }
      if (other.getSecondNum() != 0) {
        setSecondNum(other.getSecondNum());
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
      com.proto.greeting.CalculatorRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.greeting.CalculatorRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int firstNum_ ;
    /**
     * <code>int32 first_num = 1;</code>
     * @return The firstNum.
     */
    @java.lang.Override
    public int getFirstNum() {
      return firstNum_;
    }
    /**
     * <code>int32 first_num = 1;</code>
     * @param value The firstNum to set.
     * @return This builder for chaining.
     */
    public Builder setFirstNum(int value) {
      
      firstNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 first_num = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFirstNum() {
      
      firstNum_ = 0;
      onChanged();
      return this;
    }

    private int secondNum_ ;
    /**
     * <code>int32 second_num = 2;</code>
     * @return The secondNum.
     */
    @java.lang.Override
    public int getSecondNum() {
      return secondNum_;
    }
    /**
     * <code>int32 second_num = 2;</code>
     * @param value The secondNum to set.
     * @return This builder for chaining.
     */
    public Builder setSecondNum(int value) {
      
      secondNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 second_num = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSecondNum() {
      
      secondNum_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:greeting.CalculatorRequest)
  }

  // @@protoc_insertion_point(class_scope:greeting.CalculatorRequest)
  private static final com.proto.greeting.CalculatorRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.greeting.CalculatorRequest();
  }

  public static com.proto.greeting.CalculatorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CalculatorRequest>
      PARSER = new com.google.protobuf.AbstractParser<CalculatorRequest>() {
    @java.lang.Override
    public CalculatorRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CalculatorRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CalculatorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CalculatorRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.greeting.CalculatorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
