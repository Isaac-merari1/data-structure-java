package graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Vertices
 * Edges
 * Adjacency matrix or list
 * directional, bi-directional, undirectional,
 * directed and weighted, directed with no weight, undirected with weight and undirected with no weight.
 * https://www.geeksforgeeks.org/introduction-to-graphs-data-structure-and-algorithm-tutorials/
 * where is our root/source ?
 * is the graph directed or undirected?
 */
public class GraphImpl {
    private final Map<Integer , LinkedList<Integer>> adjacentMatrix;
    private int vertices;
    private int edges;
    private boolean isDirected;
    public GraphImpl(){
        this.isDirected = false;
        this.adjacentMatrix = new HashMap<>();
    }

    public boolean isDirected() {
        return isDirected;
    }

    public void setDirected(boolean directed) {
        isDirected = directed;
    }

    public int getVertices() {
        return adjacentMatrix.size();
    }
    public int getEdges() {
        return edges;
    }

    public int degree(int vertex){
        LinkedList<Integer> value = adjacentMatrix.get(vertex);
        if(value == null){
            return -1;
        }
        return value.size();
    }
    public void addEdge(int source, int destination){
        adjacentMatrix.putIfAbsent(source, new LinkedList<>());
        adjacentMatrix.putIfAbsent(destination, new LinkedList<>());
        adjacentMatrix.get(source).add(destination);
        if(!isDirected){
            adjacentMatrix.get(destination).add(source);
            vertices += 1;
        }
        vertices += 1;
        edges +=1;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(Map.Entry<Integer,LinkedList<Integer>> entry : adjacentMatrix.entrySet()){
            int key = entry.getKey();
            builder.append(key).append(": ").append("[");
            for(Integer value: adjacentMatrix.get(key)){
                builder.append(value).append(" ");
            }
            builder.append("]").append("\n");
        }
        return builder.toString();
    }


    public static void main(String[] args) {
/**
 *  0: 1 2 3
 *  1: 0 3
 *  2: 0 3
 *  3: 0 1 2
 */

/**
 * example 2
 * 0: [1 2 3]
 * 1: [0 2 4]
 * 2: [0 1 3]
 * 3: [0 2 4]
 * 4: [1 3]
 */
        GraphImpl graphImpl =  new GraphImpl();

        graphImpl.addEdge(0, 1);
        graphImpl.addEdge(0, 2);
        graphImpl.addEdge(0, 3);
        graphImpl.addEdge(1, 3);
        graphImpl.addEdge(2, 3);
//        System.out.println(graphImpl);

//        System.out.println("example 2");
        GraphImpl graphImpl2 =  new GraphImpl();

        graphImpl2.addEdge(0, 1);
        graphImpl2.addEdge(0, 2);
        graphImpl2.addEdge(0, 3);
        graphImpl2.addEdge(1, 2);
        graphImpl2.addEdge(1, 4);
        graphImpl2.addEdge(2, 3);
        graphImpl2.addEdge(3, 4);
        System.out.println(graphImpl2);

//        System.out.println("\tThis text is one tab in.\r\n");

        /**
         * example
         * 0: [2]
         * 1: [0 ]
         * 2: [3]
         * 3: [0, 1]
         */

        System.out.println("example with directional graph");
        GraphImpl bidirectionalGraph =  new GraphImpl();
        bidirectionalGraph.setDirected(true);

        bidirectionalGraph.addEdge(0, 2);
        bidirectionalGraph.addEdge(1, 0);
        bidirectionalGraph.addEdge(2, 3);
        bidirectionalGraph.addEdge(3, 0);
        bidirectionalGraph.addEdge(3, 1);
        System.out.println(bidirectionalGraph);


    }
}


