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

    @BeforeEach
    void setUp(){
        StringReader stringReader = new StringReader("2 y 4 n n y 6 n n");
        Scanner scanner = new Scanner(stringReader);
        BinaryTreeImpl tree = new BinaryTreeImpl(scanner);

        root = tree.create();
    }
    @Test
    void testCreate() {

        String expected = "[2 l=[4 l=null r=null] r=[6 l=null r=null]]";
        assertThat(root.toString()).isEqualTo(expected);

//        BinaryTreeImpl binary = new BinaryTreeImpl();
//        Node node = new Node("1");
//        doReturn(node).when(binary).create();
//
//        Node result = binary.create();

//        assertThat()
//        Mockito.mock()
    }
}