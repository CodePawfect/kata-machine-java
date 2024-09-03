import model.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {

    public Graph.Vertex breadthFirstSearch(Graph graph, char needle) {
        int[][] adjacencyMatrix = graph.getAdjacencyMatrix();
        boolean[] seen = new boolean[adjacencyMatrix.length];
        Queue<Graph.Vertex> queue = new LinkedList<>();
        int vertexIndex = 0;

        queue.add(graph.getVertex(0));

        while(!queue.isEmpty()) {
            Graph.Vertex curVertex = queue.poll();

            if(curVertex.value() == needle) return curVertex;
            seen[vertexIndex++] = true;

            for(int i = 0; i < adjacencyMatrix.length; i++) {
                if(adjacencyMatrix[vertexIndex][i] == 1 && !seen[i]) {
                    queue.add(graph.getVertex(i));
                }
            }
        }

        return null;
    }

}


