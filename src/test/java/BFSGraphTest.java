import datastructure.Graph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BFSGraphTest {

    private final BFSGraph bfsGraph = new BFSGraph();

    @Test
    void breathFirstSearch_successfully() {
        char needle = 'D';
        Graph graph = new Graph(5);

        graph.addVertex(new Graph.Vertex('A'), 0);
        graph.addVertex(new Graph.Vertex('B'), 1);
        graph.addVertex(new Graph.Vertex('C'), 2);
        graph.addVertex(new Graph.Vertex('D'), 3);
        graph.addVertex(new Graph.Vertex('E'), 4);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 2);

        graph.printAdjacencyMatrix(); // visualize the adjacency matrix

        Graph.Vertex actualVertex = bfsGraph.breadthFirstSearch(graph, needle);
        Graph.Vertex expectedVertex = new Graph.Vertex(needle);

        Assertions.assertEquals(expectedVertex, actualVertex);
    }

}
