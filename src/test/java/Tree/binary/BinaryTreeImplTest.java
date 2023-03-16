package Tree.binary;

import com.sun.source.tree.BinaryTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.StringReader;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeImplTest {

    private Node root;

    private binaryNode binaryRoot;

    @BeforeEach
    void setUp(){
        StringReader stringReader = new StringReader("3 y 2 y 1 n n y 6 n n y 5 y 4 n n y 8 y 7 n n y 9 n n");
        Scanner scanner = new Scanner(stringReader);
        BinaryTreeImpl tree = new BinaryTreeImpl(scanner);

        binaryRoot = tree.create();
    }
    @Test
    void testCreate() {

        String expected = "[3 l=[2 l=[1 l=null r=null] r=[6 l=null r=null]] r=[5 l=[4 l=null r=null] r=[8 l=[7 l=null r=null] r=[9 l=null r=null]]]]";
        assertThat(binaryRoot.toString()).isEqualTo(expected);

//        BinaryTreeImpl binary = new BinaryTreeImpl();
//        Node node = new Node("1");
//        doReturn(node).when(binary).create();
//
//        Node result = binary.create();

//        assertThat()
//        Mockito.mock()
    }

    @Test
    void deleteNode(){
        String expected = "[3 l=[6 l=[1 l=null r=null] r=null] r=[5 l=[4 l=null r=null] r=[8 l=[7 l=null r=null] r=[9 l=null r=null]]]]";
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
       String a = String.valueOf(binaryTree.deleteNode(binaryRoot,2));

        assertThat(a).isEqualTo(expected);

    }
}