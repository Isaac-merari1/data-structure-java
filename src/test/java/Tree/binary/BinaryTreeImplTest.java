package Tree.binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeImplTest {

    @Test
    void create() {
        BinaryTreeImpl binary = new BinaryTreeImpl();
        Node node = new Node("1");
        doReturn(node).when(binary).create();

        Node result = binary.create();

//        assertThat()
//        Mockito.mock()
    }
}