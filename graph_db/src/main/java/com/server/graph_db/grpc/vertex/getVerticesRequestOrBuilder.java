// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vertex.proto

package com.server.graph_db.grpc.vertex;

public interface getVerticesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:getVerticesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int32 vertexIds = 1;</code>
   * @return A list containing the vertexIds.
   */
  java.util.List<java.lang.Integer> getVertexIdsList();
  /**
   * <code>repeated int32 vertexIds = 1;</code>
   * @return The count of vertexIds.
   */
  int getVertexIdsCount();
  /**
   * <code>repeated int32 vertexIds = 1;</code>
   * @param index The index of the element to return.
   * @return The vertexIds at the given index.
   */
  int getVertexIds(int index);
}
