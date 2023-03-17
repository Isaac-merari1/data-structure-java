package Tree.binary;

import com.sun.source.tree.BinaryTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class TraversalTest {
private Node root;
private binaryNode binaryRoot;
    @BeforeEach
    void setUp(){
        StringReader stringReader = new StringReader("2 y 4 n n y 6 n n");
        Scanner scanner = new Scanner(stringReader);
        BinaryTreeImpl tree = new BinaryTreeImpl(scanner);

        binaryRoot = tree.create();
    }
    @Test
    void testPreOrderRecursion() {
        List<String> result = new ArrayList<>();
        Traversal.preOrderRecursion(result, root);

        assertThat(result.toString()).isEqualTo("[2, 4, 6]");
    }
    @Test
    void testInOrderRecursion() {
        List<String> result = new ArrayList<>();
        Traversal.inOrderRecursion(result, root);

        assertThat(result.toString()).isEqualTo("[4, 2, 6]");
    }
    @Test
    void testPostOrderRecursion() {
        List<String> result = new ArrayList<>();
        Traversal.postOrderRecursion(result, root);

        assertThat(result.toString()).isEqualTo("[4, 6, 2]");
    }
    @Test
    void testPreOrderIteration() {
        List<String> result = new ArrayList<>();
        Traversal.preOrderIteration(result, root);

        assertThat(result.toString()).isEqualTo("[2, 4, 6]");
    }
    @Test
    void testInOrderIteration() {
        List<String> result = new ArrayList<>();
        Traversal.inOrderRecursion(result, root);

        assertThat(result.toString()).isEqualTo("[4, 2, 6]");
    }

    @Test
    void testPostOrderIteration() {
        List<String> result = new ArrayList<>();
        Traversal.postOrderRecursion(result, root);

        assertThat(result.toString()).isEqualTo("[4, 6, 2]");
    }

    @Test
    void testLevelOrderIteration() {
        List<String> result = new ArrayList<>();
        Traversal.levelOrderIteration(result, root);

        assertThat(result.isEmpty()).isFalse();
        assertThat(result.toString()).isEqualTo("[2, 4, 6]");
    }



//    @Test
//    void testBinarySearch(){
//        BinarySearchTreeImpl binarySearchTree = new BinarySearchTreeImpl();
//
//        int result =  binarySearchTree.binarySearch(10);
//
//        assertThat(result).isEqualTo(-1);
//    }

}