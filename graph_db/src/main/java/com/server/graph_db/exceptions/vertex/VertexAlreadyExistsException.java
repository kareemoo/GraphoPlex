package com.server.graph_db.exceptions.vertex;

public class VertexAlreadyExistsException extends Exception {
    String vertexId;
    public VertexAlreadyExistsException(String vertexId) {
        super("Vertex with id: " + vertexId + " already exists");
   }
    
}
