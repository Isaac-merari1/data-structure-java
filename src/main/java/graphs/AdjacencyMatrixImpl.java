package graphs;

import java.util.LinkedList;
import java.util.Map;

public class AdjacencyMatrixImpl {
    private final boolean[][] adjacentMatrix;
    private int edges;

    public AdjacencyMatrixImpl(int vertices) {
        this.adjacentMatrix = new boolean[vertices][vertices];
    }
    public void addEdge(int src, int dest){
        this.adjacentMatrix[src][dest] = true;
        this.adjacentMatrix[dest][src] = true;
        this.edges +=1;
    }

    public int getVertices(){
        return this.adjacentMatrix.length;
    }
     public int getEdges(){
        return edges;
     }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(int row =0; row<adjacentMatrix.length; row++){
            builder.append(row).append(": ").append("[");
            for(int column=0; column<adjacentMatrix.length; column++){
                boolean value = adjacentMatrix[row][column];
                if(value){
                    builder.append(column).append(" ");
                }
            }
            builder.append("]").append("\n");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        /**
         * example
         * 0: [1 2 3]
         * 1: [0 3]
         * 2: [0 3]
         * 3: [0 1 2]
         */

        System.out.println("example with directional graph");
        AdjacencyMatrixImpl adjacencyMatrix =  new AdjacencyMatrixImpl(4);
//        adjacencyMatrix.setDirected(true);

        adjacencyMatrix.addEdge(0, 1);
        adjacencyMatrix.addEdge(0, 2);
        adjacencyMatrix.addEdge(0, 3);
        adjacencyMatrix.addEdge(1, 3);
        adjacencyMatrix.addEdge(2, 3);
        System.out.println(adjacencyMatrix);

    }
}
