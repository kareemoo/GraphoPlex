package com.server.graph_db.alghorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import com.server.graph_db.alghorithms.traversables.DijkstraTraversable;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.GlobalVertexService;

public class BellmanFord implements ShortestPathAlghorithm {

    GlobalVertexService globalVertexService;

    String sourceVertexId;
    String destinationVertexId;
    long shortestPath = 0;
    LinkedList<Edge> pathReturned;
    HashMap<String, DijkstraTraversable> visited;
    HashSet<Edge> allEdges;

    public BellmanFord(GlobalVertexService globalVertexService) {
        this.globalVertexService = globalVertexService;
    }

    public void compute(String source, String destination, String costField) throws Exception {
        sourceVertexId = source;
        destinationVertexId = destination;
        visited = new HashMap<String, DijkstraTraversable>();
        pathReturned = new LinkedList<Edge>();
        visited.put(sourceVertexId, new DijkstraTraversable(sourceVertexId, 0L, null));
        long vertexCount = globalVertexService.getVertexCount();
        Iterable<String> allVertices = globalVertexService.getAllVerticesIds();
        Iterable<Edge> allEdges = globalVertexService.getIncomingEdges(allVertices);
        for (long i = 1; i < vertexCount; ++i) {
            for (Edge edge : allEdges) {
                String u = edge.getSourceVertexId();
                String v = edge.getDestinationVertexId();
                long weight = Long.parseLong(edge.getProperties().get(costField));
                if (visited.get(u) != null && (visited.get(v) == null
                        || visited.get(u).getDistance() + weight < visited.get(v).getDistance()))
                    visited.put(v, new DijkstraTraversable(v, visited.get(u).getDistance() + weight, edge));
            }
        }
        shortestPath = visited.get(destination).getDistance();
    }

    @Override
    public long getShortestPath() {
        return shortestPath;
    }

    @Override
    public Iterable<Edge> getPath() throws Exception {
        DijkstraTraversable currentVertex = visited.get(destinationVertexId);
        if (currentVertex == null) {
            throw new Exception("Vertex with id " + destinationVertexId + " is not reachable from vertex with id "
                    + sourceVertexId + "");
        }
        while (currentVertex != null && currentVertex.getPrecedingEdge() != null) {
            pathReturned.addFirst(currentVertex.getPrecedingEdge());
            currentVertex = visited.get(currentVertex.getPrecedingEdge().getSourceVertexId());
        }
        return pathReturned;
    }
}
