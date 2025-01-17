// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vertex.proto

package com.server.graph_db.grpc.vertex;

/**
 * Protobuf type {@code createEdgeRequest}
 */
public final class createEdgeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:createEdgeRequest)
    createEdgeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use createEdgeRequest.newBuilder() to construct.
  private createEdgeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private createEdgeRequest() {
    sourceVertexId_ = "";
    destinationVertexId_ = "";
    label_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new createEdgeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private createEdgeRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            sourceVertexId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            destinationVertexId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            label_ = s;
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              properties_ = com.google.protobuf.MapField.newMapField(
                  PropertiesDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            properties__ = input.readMessage(
                PropertiesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            properties_.getMutableMap().put(
                properties__.getKey(), properties__.getValue());
            break;
          }
          case 40: {

            isOutGoing_ = input.readBool();
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
    return com.server.graph_db.grpc.vertex.Vertex.internal_static_createEdgeRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 4:
        return internalGetProperties();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.server.graph_db.grpc.vertex.Vertex.internal_static_createEdgeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.server.graph_db.grpc.vertex.createEdgeRequest.class, com.server.graph_db.grpc.vertex.createEdgeRequest.Builder.class);
  }

  public static final int SOURCEVERTEXID_FIELD_NUMBER = 1;
  private volatile java.lang.Object sourceVertexId_;
  /**
   * <code>string sourceVertexId = 1;</code>
   * @return The sourceVertexId.
   */
  @java.lang.Override
  public java.lang.String getSourceVertexId() {
    java.lang.Object ref = sourceVertexId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceVertexId_ = s;
      return s;
    }
  }
  /**
   * <code>string sourceVertexId = 1;</code>
   * @return The bytes for sourceVertexId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSourceVertexIdBytes() {
    java.lang.Object ref = sourceVertexId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sourceVertexId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESTINATIONVERTEXID_FIELD_NUMBER = 2;
  private volatile java.lang.Object destinationVertexId_;
  /**
   * <code>string destinationVertexId = 2;</code>
   * @return The destinationVertexId.
   */
  @java.lang.Override
  public java.lang.String getDestinationVertexId() {
    java.lang.Object ref = destinationVertexId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destinationVertexId_ = s;
      return s;
    }
  }
  /**
   * <code>string destinationVertexId = 2;</code>
   * @return The bytes for destinationVertexId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDestinationVertexIdBytes() {
    java.lang.Object ref = destinationVertexId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      destinationVertexId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LABEL_FIELD_NUMBER = 3;
  private volatile java.lang.Object label_;
  /**
   * <code>string label = 3;</code>
   * @return The label.
   */
  @java.lang.Override
  public java.lang.String getLabel() {
    java.lang.Object ref = label_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      label_ = s;
      return s;
    }
  }
  /**
   * <code>string label = 3;</code>
   * @return The bytes for label.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLabelBytes() {
    java.lang.Object ref = label_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      label_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROPERTIES_FIELD_NUMBER = 4;
  private static final class PropertiesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.server.graph_db.grpc.vertex.Vertex.internal_static_createEdgeRequest_PropertiesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> properties_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetProperties() {
    if (properties_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          PropertiesDefaultEntryHolder.defaultEntry);
    }
    return properties_;
  }

  public int getPropertiesCount() {
    return internalGetProperties().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; properties = 4;</code>
   */

  @java.lang.Override
  public boolean containsProperties(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetProperties().getMap().containsKey(key);
  }
  /**
   * Use {@link #getPropertiesMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getProperties() {
    return getPropertiesMap();
  }
  /**
   * <code>map&lt;string, string&gt; properties = 4;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getPropertiesMap() {
    return internalGetProperties().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; properties = 4;</code>
   */
  @java.lang.Override

  public java.lang.String getPropertiesOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetProperties().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; properties = 4;</code>
   */
  @java.lang.Override

  public java.lang.String getPropertiesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetProperties().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int ISOUTGOING_FIELD_NUMBER = 5;
  private boolean isOutGoing_;
  /**
   * <pre>
   *boolean variable
   * </pre>
   *
   * <code>bool isOutGoing = 5;</code>
   * @return The isOutGoing.
   */
  @java.lang.Override
  public boolean getIsOutGoing() {
    return isOutGoing_;
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
    if (!getSourceVertexIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sourceVertexId_);
    }
    if (!getDestinationVertexIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, destinationVertexId_);
    }
    if (!getLabelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, label_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetProperties(),
        PropertiesDefaultEntryHolder.defaultEntry,
        4);
    if (isOutGoing_ != false) {
      output.writeBool(5, isOutGoing_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSourceVertexIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sourceVertexId_);
    }
    if (!getDestinationVertexIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, destinationVertexId_);
    }
    if (!getLabelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, label_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetProperties().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      properties__ = PropertiesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, properties__);
    }
    if (isOutGoing_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, isOutGoing_);
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
    if (!(obj instanceof com.server.graph_db.grpc.vertex.createEdgeRequest)) {
      return super.equals(obj);
    }
    com.server.graph_db.grpc.vertex.createEdgeRequest other = (com.server.graph_db.grpc.vertex.createEdgeRequest) obj;

    if (!getSourceVertexId()
        .equals(other.getSourceVertexId())) return false;
    if (!getDestinationVertexId()
        .equals(other.getDestinationVertexId())) return false;
    if (!getLabel()
        .equals(other.getLabel())) return false;
    if (!internalGetProperties().equals(
        other.internalGetProperties())) return false;
    if (getIsOutGoing()
        != other.getIsOutGoing()) return false;
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
    hash = (37 * hash) + SOURCEVERTEXID_FIELD_NUMBER;
    hash = (53 * hash) + getSourceVertexId().hashCode();
    hash = (37 * hash) + DESTINATIONVERTEXID_FIELD_NUMBER;
    hash = (53 * hash) + getDestinationVertexId().hashCode();
    hash = (37 * hash) + LABEL_FIELD_NUMBER;
    hash = (53 * hash) + getLabel().hashCode();
    if (!internalGetProperties().getMap().isEmpty()) {
      hash = (37 * hash) + PROPERTIES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetProperties().hashCode();
    }
    hash = (37 * hash) + ISOUTGOING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsOutGoing());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.server.graph_db.grpc.vertex.createEdgeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.server.graph_db.grpc.vertex.createEdgeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.server.graph_db.grpc.vertex.createEdgeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.server.graph_db.grpc.vertex.createEdgeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.server.graph_db.grpc.vertex.createEdgeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.server.graph_db.grpc.vertex.createEdgeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.server.graph_db.grpc.vertex.createEdgeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.server.graph_db.grpc.vertex.createEdgeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.server.graph_db.grpc.vertex.createEdgeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.server.graph_db.grpc.vertex.createEdgeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.server.graph_db.grpc.vertex.createEdgeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.server.graph_db.grpc.vertex.createEdgeRequest parseFrom(
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
  public static Builder newBuilder(com.server.graph_db.grpc.vertex.createEdgeRequest prototype) {
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
   * Protobuf type {@code createEdgeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:createEdgeRequest)
      com.server.graph_db.grpc.vertex.createEdgeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.server.graph_db.grpc.vertex.Vertex.internal_static_createEdgeRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetProperties();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetMutableProperties();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.server.graph_db.grpc.vertex.Vertex.internal_static_createEdgeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.server.graph_db.grpc.vertex.createEdgeRequest.class, com.server.graph_db.grpc.vertex.createEdgeRequest.Builder.class);
    }

    // Construct using com.server.graph_db.grpc.vertex.createEdgeRequest.newBuilder()
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
      sourceVertexId_ = "";

      destinationVertexId_ = "";

      label_ = "";

      internalGetMutableProperties().clear();
      isOutGoing_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.server.graph_db.grpc.vertex.Vertex.internal_static_createEdgeRequest_descriptor;
    }

    @java.lang.Override
    public com.server.graph_db.grpc.vertex.createEdgeRequest getDefaultInstanceForType() {
      return com.server.graph_db.grpc.vertex.createEdgeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.server.graph_db.grpc.vertex.createEdgeRequest build() {
      com.server.graph_db.grpc.vertex.createEdgeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.server.graph_db.grpc.vertex.createEdgeRequest buildPartial() {
      com.server.graph_db.grpc.vertex.createEdgeRequest result = new com.server.graph_db.grpc.vertex.createEdgeRequest(this);
      int from_bitField0_ = bitField0_;
      result.sourceVertexId_ = sourceVertexId_;
      result.destinationVertexId_ = destinationVertexId_;
      result.label_ = label_;
      result.properties_ = internalGetProperties();
      result.properties_.makeImmutable();
      result.isOutGoing_ = isOutGoing_;
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
      if (other instanceof com.server.graph_db.grpc.vertex.createEdgeRequest) {
        return mergeFrom((com.server.graph_db.grpc.vertex.createEdgeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.server.graph_db.grpc.vertex.createEdgeRequest other) {
      if (other == com.server.graph_db.grpc.vertex.createEdgeRequest.getDefaultInstance()) return this;
      if (!other.getSourceVertexId().isEmpty()) {
        sourceVertexId_ = other.sourceVertexId_;
        onChanged();
      }
      if (!other.getDestinationVertexId().isEmpty()) {
        destinationVertexId_ = other.destinationVertexId_;
        onChanged();
      }
      if (!other.getLabel().isEmpty()) {
        label_ = other.label_;
        onChanged();
      }
      internalGetMutableProperties().mergeFrom(
          other.internalGetProperties());
      if (other.getIsOutGoing() != false) {
        setIsOutGoing(other.getIsOutGoing());
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
      com.server.graph_db.grpc.vertex.createEdgeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.server.graph_db.grpc.vertex.createEdgeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object sourceVertexId_ = "";
    /**
     * <code>string sourceVertexId = 1;</code>
     * @return The sourceVertexId.
     */
    public java.lang.String getSourceVertexId() {
      java.lang.Object ref = sourceVertexId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceVertexId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sourceVertexId = 1;</code>
     * @return The bytes for sourceVertexId.
     */
    public com.google.protobuf.ByteString
        getSourceVertexIdBytes() {
      java.lang.Object ref = sourceVertexId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sourceVertexId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sourceVertexId = 1;</code>
     * @param value The sourceVertexId to set.
     * @return This builder for chaining.
     */
    public Builder setSourceVertexId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sourceVertexId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sourceVertexId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceVertexId() {
      
      sourceVertexId_ = getDefaultInstance().getSourceVertexId();
      onChanged();
      return this;
    }
    /**
     * <code>string sourceVertexId = 1;</code>
     * @param value The bytes for sourceVertexId to set.
     * @return This builder for chaining.
     */
    public Builder setSourceVertexIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sourceVertexId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object destinationVertexId_ = "";
    /**
     * <code>string destinationVertexId = 2;</code>
     * @return The destinationVertexId.
     */
    public java.lang.String getDestinationVertexId() {
      java.lang.Object ref = destinationVertexId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destinationVertexId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string destinationVertexId = 2;</code>
     * @return The bytes for destinationVertexId.
     */
    public com.google.protobuf.ByteString
        getDestinationVertexIdBytes() {
      java.lang.Object ref = destinationVertexId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        destinationVertexId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string destinationVertexId = 2;</code>
     * @param value The destinationVertexId to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationVertexId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      destinationVertexId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string destinationVertexId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDestinationVertexId() {
      
      destinationVertexId_ = getDefaultInstance().getDestinationVertexId();
      onChanged();
      return this;
    }
    /**
     * <code>string destinationVertexId = 2;</code>
     * @param value The bytes for destinationVertexId to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationVertexIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      destinationVertexId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object label_ = "";
    /**
     * <code>string label = 3;</code>
     * @return The label.
     */
    public java.lang.String getLabel() {
      java.lang.Object ref = label_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        label_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string label = 3;</code>
     * @return The bytes for label.
     */
    public com.google.protobuf.ByteString
        getLabelBytes() {
      java.lang.Object ref = label_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        label_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string label = 3;</code>
     * @param value The label to set.
     * @return This builder for chaining.
     */
    public Builder setLabel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      label_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string label = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLabel() {
      
      label_ = getDefaultInstance().getLabel();
      onChanged();
      return this;
    }
    /**
     * <code>string label = 3;</code>
     * @param value The bytes for label to set.
     * @return This builder for chaining.
     */
    public Builder setLabelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      label_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> properties_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetProperties() {
      if (properties_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PropertiesDefaultEntryHolder.defaultEntry);
      }
      return properties_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableProperties() {
      onChanged();;
      if (properties_ == null) {
        properties_ = com.google.protobuf.MapField.newMapField(
            PropertiesDefaultEntryHolder.defaultEntry);
      }
      if (!properties_.isMutable()) {
        properties_ = properties_.copy();
      }
      return properties_;
    }

    public int getPropertiesCount() {
      return internalGetProperties().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; properties = 4;</code>
     */

    @java.lang.Override
    public boolean containsProperties(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetProperties().getMap().containsKey(key);
    }
    /**
     * Use {@link #getPropertiesMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getProperties() {
      return getPropertiesMap();
    }
    /**
     * <code>map&lt;string, string&gt; properties = 4;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getPropertiesMap() {
      return internalGetProperties().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; properties = 4;</code>
     */
    @java.lang.Override

    public java.lang.String getPropertiesOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetProperties().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; properties = 4;</code>
     */
    @java.lang.Override

    public java.lang.String getPropertiesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetProperties().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearProperties() {
      internalGetMutableProperties().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; properties = 4;</code>
     */

    public Builder removeProperties(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableProperties().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableProperties() {
      return internalGetMutableProperties().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; properties = 4;</code>
     */
    public Builder putProperties(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableProperties().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; properties = 4;</code>
     */

    public Builder putAllProperties(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableProperties().getMutableMap()
          .putAll(values);
      return this;
    }

    private boolean isOutGoing_ ;
    /**
     * <pre>
     *boolean variable
     * </pre>
     *
     * <code>bool isOutGoing = 5;</code>
     * @return The isOutGoing.
     */
    @java.lang.Override
    public boolean getIsOutGoing() {
      return isOutGoing_;
    }
    /**
     * <pre>
     *boolean variable
     * </pre>
     *
     * <code>bool isOutGoing = 5;</code>
     * @param value The isOutGoing to set.
     * @return This builder for chaining.
     */
    public Builder setIsOutGoing(boolean value) {
      
      isOutGoing_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *boolean variable
     * </pre>
     *
     * <code>bool isOutGoing = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsOutGoing() {
      
      isOutGoing_ = false;
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


    // @@protoc_insertion_point(builder_scope:createEdgeRequest)
  }

  // @@protoc_insertion_point(class_scope:createEdgeRequest)
  private static final com.server.graph_db.grpc.vertex.createEdgeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.server.graph_db.grpc.vertex.createEdgeRequest();
  }

  public static com.server.graph_db.grpc.vertex.createEdgeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<createEdgeRequest>
      PARSER = new com.google.protobuf.AbstractParser<createEdgeRequest>() {
    @java.lang.Override
    public createEdgeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new createEdgeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<createEdgeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<createEdgeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.server.graph_db.grpc.vertex.createEdgeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

