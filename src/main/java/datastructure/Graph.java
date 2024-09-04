package datastructure;

public class Graph {

    int[][] adjacencyMatrix;
    Vertex[] vertices;

    public Graph(int numberOfVertices) {
        adjacencyMatrix = new int[numberOfVertices][numberOfVertices];
        vertices = new Vertex[numberOfVertices];
    }

    public void addEdge(int from, int to) {
        adjacencyMatrix[from][to] = 1;
    }

    public void addVertex(Vertex vertex, int index) {
        this.vertices[index] = vertex;
    }

    public Vertex getVertex(int index) {
        return vertices[index];
    }

    public int[][] getAdjacencyMatrix() {
        return adjacencyMatrix;
    }

    public void printAdjacencyMatrix() {
        for(int i = 0; i < adjacencyMatrix.length; i++){
            if(i > 0) {
                System.out.println();
            }
            for(int j = 0; j < adjacencyMatrix.length; j++) {
                System.out.print(adjacencyMatrix[i][j]);
            }
        }
    }

    public record Vertex(char value) {}
}
