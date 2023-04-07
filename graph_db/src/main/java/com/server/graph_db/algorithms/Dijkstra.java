package com.server.graph_db.algorithms;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.server.graph_db.algorithms.traversables.DijkstraTraversable;
import com.server.graph_db.vertex.Edge;
import com.server.graph_db.vertex.GlobalVertexService;
import com.server.graph_db.vertex.Vertex;


@Component
public class Dijkstra {

    @Autowired
    GlobalVertexService vertexService;

    String sourceVertexId;
    String destinationVertexId;

    int count = 0;

    LinkedList<String> pathReturned;
    HashMap<String, DijkstraTraversable> visited;

    
    PriorityQueue<DijkstraTraversable> queue;
    long shortestPath = 0;


    public void compute(String source, String destination, String costField) {
        visited = new HashMap<String, DijkstraTraversable>();
        queue = new PriorityQueue<DijkstraTraversable>();
        pathReturned = new LinkedList<String>();
        sourceVertexId = source;
        destinationVertexId = destination;
        queue.add(new DijkstraTraversable(source, 0L, source ));
        while (!queue.isEmpty()) {
            DijkstraTraversable currentVertex = queue.poll();
            if (currentVertex.getVertexId() .equals( destination)) {
                visited.put(currentVertex.getVertexId(), currentVertex);
                shortestPath = currentVertex.getDistance();
                break;
            }
            if (visited.containsKey(currentVertex.getVertexId())) {
                continue;
            }
            count++;
           // System.out.println(count);
            visited.put(currentVertex.getVertexId(), currentVertex);
            
            //get outgoing edges of current vertex using globalVertexService and ensure it's not null
            Vertex visitedVertex = vertexService.getVertex(currentVertex.getVertexId());
            LinkedList<Edge> neighbours = visitedVertex!=null?visitedVertex.getOutgoingEdges():new LinkedList<Edge>();
            

            for (Edge neighbour : neighbours) {
                queue.add(new DijkstraTraversable(neighbour.getDestinationVertexId(), currentVertex.getDistance() + Long.parseLong(neighbour.getProperties().get(costField)), currentVertex.getVertexId()));
            }
        }

        
    }
    public int getCount(){
        return count;
    }

    public long compute(int source, int destination, int maxHops) {
        return 0;
    }

    public long compute(int source, int destination, int maxHops, int maxCost) {
        return 0;
    }


    public long getShortestPath() {
        return shortestPath;
    }


    public Iterable<String> getPath() {
        DijkstraTraversable currentVertex = visited.get(destinationVertexId);
        while (currentVertex.getVertexId() != sourceVertexId) {
            pathReturned.addFirst(currentVertex.getVertexId());
            currentVertex = visited.get(currentVertex.getParentId());
        }
        pathReturned.addFirst(sourceVertexId);
        return pathReturned;
    }



    
}