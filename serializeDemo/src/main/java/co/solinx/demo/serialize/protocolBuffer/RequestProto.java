// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Request.proto

package co.solinx.demo.serialize.protocolBuffer;

public final class RequestProto {
  private RequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protocolBuffer.Request)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>required int32 id = 1;</code>
     */
    int getId();

    /**
     * <code>required string data = 2;</code>
     */
    boolean hasData();
    /**
     * <code>required string data = 2;</code>
     */
    java.lang.String getData();
    /**
     * <code>required string data = 2;</code>
     */
    com.google.protobuf.ByteString
        getDataBytes();

    /**
     * <code>optional .protocolBuffer.Response response = 3;</code>
     */
    boolean hasResponse();
    /**
     * <code>optional .protocolBuffer.Response response = 3;</code>
     */
    co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response getResponse();
    /**
     * <code>optional .protocolBuffer.Response response = 3;</code>
     */
    co.solinx.demo.serialize.protocolBuffer.ResponseProto.ResponseOrBuilder getResponseOrBuilder();

    /**
     * <code>required string version = 4;</code>
     */
    boolean hasVersion();
    /**
     * <code>required string version = 4;</code>
     */
    java.lang.String getVersion();
    /**
     * <code>required string version = 4;</code>
     */
    com.google.protobuf.ByteString
        getVersionBytes();
  }
  /**
   * Protobuf type {@code protocolBuffer.Request}
   */
  public static final class Request extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:protocolBuffer.Request)
      RequestOrBuilder {
    // Use Request.newBuilder() to construct.
    private Request(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Request(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Request defaultInstance;
    public static Request getDefaultInstance() {
      return defaultInstance;
    }

    public Request getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Request(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readInt32();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              data_ = bs;
              break;
            }
            case 26: {
              co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = response_.toBuilder();
              }
              response_ = input.readMessage(co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(response_);
                response_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              version_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return co.solinx.demo.serialize.protocolBuffer.RequestProto.internal_static_protocolBuffer_Request_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return co.solinx.demo.serialize.protocolBuffer.RequestProto.internal_static_protocolBuffer_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              co.solinx.demo.serialize.protocolBuffer.RequestProto.Request.class, co.solinx.demo.serialize.protocolBuffer.RequestProto.Request.Builder.class);
    }

    public static com.google.protobuf.Parser<Request> PARSER =
        new com.google.protobuf.AbstractParser<Request>() {
      public Request parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Request(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Request> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>required int32 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    public static final int DATA_FIELD_NUMBER = 2;
    private java.lang.Object data_;
    /**
     * <code>required string data = 2;</code>
     */
    public boolean hasData() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string data = 2;</code>
     */
    public java.lang.String getData() {
      java.lang.Object ref = data_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          data_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string data = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDataBytes() {
      java.lang.Object ref = data_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        data_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RESPONSE_FIELD_NUMBER = 3;
    private co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response response_;
    /**
     * <code>optional .protocolBuffer.Response response = 3;</code>
     */
    public boolean hasResponse() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .protocolBuffer.Response response = 3;</code>
     */
    public co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response getResponse() {
      return response_;
    }
    /**
     * <code>optional .protocolBuffer.Response response = 3;</code>
     */
    public co.solinx.demo.serialize.protocolBuffer.ResponseProto.ResponseOrBuilder getResponseOrBuilder() {
      return response_;
    }

    public static final int VERSION_FIELD_NUMBER = 4;
    private java.lang.Object version_;
    /**
     * <code>required string version = 4;</code>
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required string version = 4;</code>
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          version_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string version = 4;</code>
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      id_ = 0;
      data_ = "";
      response_ = co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response.getDefaultInstance();
      version_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasData()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasVersion()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasResponse()) {
        if (!getResponse().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getDataBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, response_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getVersionBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getDataBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, response_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getVersionBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static co.solinx.demo.serialize.protocolBuffer.RequestProto.Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static co.solinx.demo.serialize.protocolBuffer.RequestProto.Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static co.solinx.demo.serialize.protocolBuffer.RequestProto.Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static co.solinx.demo.serialize.protocolBuffer.RequestProto.Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static co.solinx.demo.serialize.protocolBuffer.RequestProto.Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static co.solinx.demo.serialize.protocolBuffer.RequestProto.Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static co.solinx.demo.serialize.protocolBuffer.RequestProto.Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static co.solinx.demo.serialize.protocolBuffer.RequestProto.Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static co.solinx.demo.serialize.protocolBuffer.RequestProto.Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static co.solinx.demo.serialize.protocolBuffer.RequestProto.Request parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(co.solinx.demo.serialize.protocolBuffer.RequestProto.Request prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocolBuffer.Request}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protocolBuffer.Request)
        co.solinx.demo.serialize.protocolBuffer.RequestProto.RequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return co.solinx.demo.serialize.protocolBuffer.RequestProto.internal_static_protocolBuffer_Request_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return co.solinx.demo.serialize.protocolBuffer.RequestProto.internal_static_protocolBuffer_Request_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                co.solinx.demo.serialize.protocolBuffer.RequestProto.Request.class, co.solinx.demo.serialize.protocolBuffer.RequestProto.Request.Builder.class);
      }

      // Construct using co.solinx.demo.serialize.protocolBuffer.RequestProto.Request.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getResponseFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        data_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (responseBuilder_ == null) {
          response_ = co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response.getDefaultInstance();
        } else {
          responseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        version_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return co.solinx.demo.serialize.protocolBuffer.RequestProto.internal_static_protocolBuffer_Request_descriptor;
      }

      public co.solinx.demo.serialize.protocolBuffer.RequestProto.Request getDefaultInstanceForType() {
        return co.solinx.demo.serialize.protocolBuffer.RequestProto.Request.getDefaultInstance();
      }

      public co.solinx.demo.serialize.protocolBuffer.RequestProto.Request build() {
        co.solinx.demo.serialize.protocolBuffer.RequestProto.Request result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public co.solinx.demo.serialize.protocolBuffer.RequestProto.Request buildPartial() {
        co.solinx.demo.serialize.protocolBuffer.RequestProto.Request result = new co.solinx.demo.serialize.protocolBuffer.RequestProto.Request(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.data_ = data_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (responseBuilder_ == null) {
          result.response_ = response_;
        } else {
          result.response_ = responseBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.version_ = version_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof co.solinx.demo.serialize.protocolBuffer.RequestProto.Request) {
          return mergeFrom((co.solinx.demo.serialize.protocolBuffer.RequestProto.Request)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(co.solinx.demo.serialize.protocolBuffer.RequestProto.Request other) {
        if (other == co.solinx.demo.serialize.protocolBuffer.RequestProto.Request.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasData()) {
          bitField0_ |= 0x00000002;
          data_ = other.data_;
          onChanged();
        }
        if (other.hasResponse()) {
          mergeResponse(other.getResponse());
        }
        if (other.hasVersion()) {
          bitField0_ |= 0x00000008;
          version_ = other.version_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasId()) {
          
          return false;
        }
        if (!hasData()) {
          
          return false;
        }
        if (!hasVersion()) {
          
          return false;
        }
        if (hasResponse()) {
          if (!getResponse().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        co.solinx.demo.serialize.protocolBuffer.RequestProto.Request parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (co.solinx.demo.serialize.protocolBuffer.RequestProto.Request) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <code>required int32 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object data_ = "";
      /**
       * <code>required string data = 2;</code>
       */
      public boolean hasData() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string data = 2;</code>
       */
      public java.lang.String getData() {
        java.lang.Object ref = data_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            data_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string data = 2;</code>
       */
      public com.google.protobuf.ByteString
          getDataBytes() {
        java.lang.Object ref = data_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          data_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string data = 2;</code>
       */
      public Builder setData(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string data = 2;</code>
       */
      public Builder clearData() {
        bitField0_ = (bitField0_ & ~0x00000002);
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }
      /**
       * <code>required string data = 2;</code>
       */
      public Builder setDataBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        data_ = value;
        onChanged();
        return this;
      }

      private co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response response_ = co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response, co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response.Builder, co.solinx.demo.serialize.protocolBuffer.ResponseProto.ResponseOrBuilder> responseBuilder_;
      /**
       * <code>optional .protocolBuffer.Response response = 3;</code>
       */
      public boolean hasResponse() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .protocolBuffer.Response response = 3;</code>
       */
      public co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response getResponse() {
        if (responseBuilder_ == null) {
          return response_;
        } else {
          return responseBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .protocolBuffer.Response response = 3;</code>
       */
      public Builder setResponse(co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response value) {
        if (responseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          response_ = value;
          onChanged();
        } else {
          responseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .protocolBuffer.Response response = 3;</code>
       */
      public Builder setResponse(
          co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response.Builder builderForValue) {
        if (responseBuilder_ == null) {
          response_ = builderForValue.build();
          onChanged();
        } else {
          responseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .protocolBuffer.Response response = 3;</code>
       */
      public Builder mergeResponse(co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response value) {
        if (responseBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              response_ != co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response.getDefaultInstance()) {
            response_ =
              co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response.newBuilder(response_).mergeFrom(value).buildPartial();
          } else {
            response_ = value;
          }
          onChanged();
        } else {
          responseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .protocolBuffer.Response response = 3;</code>
       */
      public Builder clearResponse() {
        if (responseBuilder_ == null) {
          response_ = co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response.getDefaultInstance();
          onChanged();
        } else {
          responseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .protocolBuffer.Response response = 3;</code>
       */
      public co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response.Builder getResponseBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getResponseFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .protocolBuffer.Response response = 3;</code>
       */
      public co.solinx.demo.serialize.protocolBuffer.ResponseProto.ResponseOrBuilder getResponseOrBuilder() {
        if (responseBuilder_ != null) {
          return responseBuilder_.getMessageOrBuilder();
        } else {
          return response_;
        }
      }
      /**
       * <code>optional .protocolBuffer.Response response = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response, co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response.Builder, co.solinx.demo.serialize.protocolBuffer.ResponseProto.ResponseOrBuilder> 
          getResponseFieldBuilder() {
        if (responseBuilder_ == null) {
          responseBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response, co.solinx.demo.serialize.protocolBuffer.ResponseProto.Response.Builder, co.solinx.demo.serialize.protocolBuffer.ResponseProto.ResponseOrBuilder>(
                  getResponse(),
                  getParentForChildren(),
                  isClean());
          response_ = null;
        }
        return responseBuilder_;
      }

      private java.lang.Object version_ = "";
      /**
       * <code>required string version = 4;</code>
       */
      public boolean hasVersion() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string version = 4;</code>
       */
      public java.lang.String getVersion() {
        java.lang.Object ref = version_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            version_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string version = 4;</code>
       */
      public com.google.protobuf.ByteString
          getVersionBytes() {
        java.lang.Object ref = version_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          version_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string version = 4;</code>
       */
      public Builder setVersion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        version_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string version = 4;</code>
       */
      public Builder clearVersion() {
        bitField0_ = (bitField0_ & ~0x00000008);
        version_ = getDefaultInstance().getVersion();
        onChanged();
        return this;
      }
      /**
       * <code>required string version = 4;</code>
       */
      public Builder setVersionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        version_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:protocolBuffer.Request)
    }

    static {
      defaultInstance = new Request(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protocolBuffer.Request)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocolBuffer_Request_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protocolBuffer_Request_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rRequest.proto\022\016protocolBuffer\032\016Respons" +
      "e.proto\"`\n\007Request\022\n\n\002id\030\001 \002(\005\022\014\n\004data\030\002" +
      " \002(\t\022*\n\010response\030\003 \001(\0132\030.protocolBuffer." +
      "Response\022\017\n\007version\030\004 \002(\tB7\n\'co.solinx.d" +
      "emo.serialize.protocolBufferB\014RequestPro" +
      "to"
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
          co.solinx.demo.serialize.protocolBuffer.ResponseProto.getDescriptor(),
        }, assigner);
    internal_static_protocolBuffer_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protocolBuffer_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_protocolBuffer_Request_descriptor,
        new java.lang.String[] { "Id", "Data", "Response", "Version", });
    co.solinx.demo.serialize.protocolBuffer.ResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
