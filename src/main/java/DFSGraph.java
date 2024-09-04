import datastructure.Graph;

public class DFSGraph {

    public Graph.Vertex depthFirstSearch(Graph graph, char needle) {
        boolean[] visited = new boolean[graph.getAdjacencyMatrix().length];
        Graph.Vertex vertex = walk(graph, 0, needle, visited);

        if(vertex != null) return vertex;

        return null;
    }

    public Graph.Vertex walk(Graph graph, int vertexIndex, char needle, boolean[] visited) {
        int[][] adjacencyMatrix = graph.getAdjacencyMatrix();
        Graph.Vertex vertex = graph.getVertex(vertexIndex);

        if(vertex.value() == needle) return vertex;

        for(int i = 0; i < adjacencyMatrix.length; i++) {
            if(adjacencyMatrix[vertexIndex][i] == 1 && visited[i] == false) {
                visited[vertexIndex] = true;
                return walk(graph, ++vertexIndex, needle, visited);
            }
        }

        return null;
    }

}
