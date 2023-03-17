package Tree.binary;

import com.sun.source.tree.BinaryTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.as;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeImplTest {

    private Node root;

    private binaryNode binaryRoot;
    private BinarySearchTreeImpl binarySearchTreeImpl;

    @BeforeEach
    void setUp(){
        binarySearchTreeImpl = new BinarySearchTreeImpl();
        /**
         *      5
         *     / \
         *    4   8
         *   /   / \
         *  3   7   9
         */
        binarySearchTreeImpl.insert(5);
        binarySearchTreeImpl.insert(4);
        binarySearchTreeImpl.insert(3);
        binarySearchTreeImpl.insert(8);
        binarySearchTreeImpl.insert(9);
        binarySearchTreeImpl.insert(7);


        StringReader stringReader = new StringReader("3 y 2 y 1 n n y 6 n n y 5 y 4 n n y 8 y 7 n n y 9 n n");
        Scanner scanner = new Scanner(stringReader);
        BinaryTreeImpl tree = new BinaryTreeImpl(scanner);

        binaryRoot = tree.create();
    }

    @Test
    void testAdd(){
        /**
         *               5
         *             /   \
         *           3       8
         *          /       /
         *                 6
         */


        searchNode root = binarySearchTreeImpl.getRoot();
        assertThat(root.toString()).hasToString("[5 l=[3 l=null r=null] r=[8 l=[6 l=null r=null] r=null]]");
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
    void testBinarySearhWhenValueExists(){
        int result = binarySearchTreeImpl.binarySearchIteration(5);

        assertThat(result).isEqualTo(1);
    }
    @Test
    void testBinarySearhWhenValueDoesNotExists(){
        int result = binarySearchTreeImpl.binarySearchIteration(15);

        assertThat(result).isEqualTo(-1);
    }

    @ParameterizedTest(name = "{0}: => {1}, {2}")
    @MethodSource
    @DisplayName(value = "test delete given that node has")
    @Test
    void testDelete(String desc, int input, String expected){
        binarySearchTreeImpl.delete(input);
        searchNode root = binarySearchTreeImpl.getRoot();

        assertThat(root.toString()).hasToString(expected);
    }

    private static Stream<Arguments> testDelete(){
        return Stream.of(
                Arguments.of("two children", 5, "[5 l=[4 l=[3 l=null r=null] r=null] r=[8 l=null r=[9 l=null r=null]]"),
                Arguments.of("one child", 4, "[5 l=[3 l=null r=null] r=[8 l=[7 l=null r=null] r=[9 l=null r=null]]"),
                Arguments.of("no child", 7, "[5 l=[4 l=[3 l=null r=null] r=null] r=[8 l=null r=[9 l=null r=null]]")
        );
    }

}