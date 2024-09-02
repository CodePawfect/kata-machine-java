import model.Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFSGraph {

    public Graph.Vertex breadthFirstSearch(Graph graph, char needle) {
        Queue<Graph.Vertex> queue = new LinkedList<>();
        int curVertexIndex = 0;

        Set<Graph.Vertex> traversed = new HashSet<>();
        queue.add(graph.getVertex(curVertexIndex));

        while(!queue.isEmpty()) {
           var vertex = queue.poll();
           addNextVerticesToQueue(curVertexIndex, queue, graph);

           if(traversed.contains(vertex)) continue;
           if(vertex.value() == needle) return vertex;

           traversed.add(vertex);
           curVertexIndex++;
        }

        return null;
    }

    private void addNextVerticesToQueue(int vertexIndex, Queue<Graph.Vertex> queue, Graph graph) {
        int[][] adjacencyMatrix = graph.getAdjacencyMatrix();

        for(int j = 0; j < adjacencyMatrix.length; j++) {
            if(adjacencyMatrix[vertexIndex][j] == 1) {
                Graph.Vertex connectedVertex = graph.getVertex(j);
                queue.add(connectedVertex);
            }
        }
    }

}


