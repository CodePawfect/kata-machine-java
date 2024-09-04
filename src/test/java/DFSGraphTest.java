import datastructure.Graph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DFSGraphTest {

    private final DFSGraph dfsGraph = new DFSGraph();

    @Test
    void breathFirstSearch_successfully() {
        char needle = 'E';
        Graph graph = new Graph(7);

        graph.addVertex(new Graph.Vertex('A'), 0);
        graph.addVertex(new Graph.Vertex('B'), 1);
        graph.addVertex(new Graph.Vertex('C'), 2);
        graph.addVertex(new Graph.Vertex('D'), 3);
        graph.addVertex(new Graph.Vertex('E'), 4);
        graph.addVertex(new Graph.Vertex('F'), 5);
        graph.addVertex(new Graph.Vertex('G'), 6);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        graph.addEdge(4, 2);
        graph.addEdge(5, 6);

        graph.printAdjacencyMatrix(); // visualize the adjacency matrix

        Graph.Vertex actualVertex = dfsGraph.depthFirstSearch(graph, needle);
        Graph.Vertex expectedVertex = new Graph.Vertex(needle);

        Assertions.assertEquals(expectedVertex, actualVertex);
    }

}
