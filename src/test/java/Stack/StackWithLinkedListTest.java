package Stack;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class StackWithLinkedListTest {

    @Test
    void testPush() {
        StackWithLinkedList<String> stackWithLinkedList = new StackWithLinkedList<>();
        stackWithLinkedList.push("mango");
        stackWithLinkedList.push("apple");
        stackWithLinkedList.push("orange");

        String result = stackWithLinkedList.toString();

        assertThat(result).isEqualTo("StackImplWithLinkedList[mango,apple,orange]");
    }
    @Test
    void testPop() {
        StackWithLinkedList<String> stackWithLinkedList = new StackWithLinkedList<>();
        stackWithLinkedList.push("mango");
        stackWithLinkedList.push("apple");
        stackWithLinkedList.push("orange");

        String pop = stackWithLinkedList.pop();
        String result = stackWithLinkedList.toString();

        assertThat(result).isEqualTo("StackImplWithLinkedList[mango,apple]");
        assertThat(pop).isEqualTo("orange");
    }
    @Test
    void testPeek() {
        StackWithLinkedList<String> stackWithLinkedList = new StackWithLinkedList<>();
        stackWithLinkedList.push("mango");
        stackWithLinkedList.push("apple");
        stackWithLinkedList.push("orange");

        String peek = stackWithLinkedList.peek();
        String result = stackWithLinkedList.toString();

        assertThat(result).isEqualTo("StackImplWithLinkedList[mango,apple,orange]");
        assertThat(peek).isEqualTo("orange");
    }
}