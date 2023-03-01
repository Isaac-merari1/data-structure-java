package Tree.binary;

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
    @BeforeEach
    void setUp(){
        StringReader stringReader = new StringReader("2 y 4 n n y 6 n n ");
        Scanner scanner = new Scanner(stringReader);
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();

        Node root = binaryTree.create();

        String expectedResults = "";
    }
    @Test
    void preOrderRecursion() {
        List<Integer> result = new ArrayList<>();
        Traversal.preOrderRecursion(result, root);

        assertThat(result.isEmpty()).isFalse();
        assertThat(result.toString()).isEqualTo("[ 2, 4, 6]");
    } @Test
    void inOrderRecursion() {
        List<Integer> result = new ArrayList<>();
        Traversal.inOrderRecursion(result, root);

        assertThat(result.isEmpty()).isFalse();
        assertThat(result.toString()).isEqualTo("[ 2, 4, 6]");
    } @Test
    void postOrderRecursion() {
        List<Integer> result = new ArrayList<>();
        Traversal.postOrderRecursion(result, root);

        assertThat(result.isEmpty()).isFalse();
        assertThat(result.toString()).isEqualTo("[ 2, 4, 6]");
    } @Test
    void levelOrderRecursion() {
        List<Integer> result = new ArrayList<>();
        Traversal.levelOrderRecursion(result, root);

        assertThat(result.isEmpty()).isFalse();
        assertThat(result.toString()).isEqualTo("[ 2, 4, 6]");
    }

}