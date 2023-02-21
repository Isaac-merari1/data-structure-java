package Stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StackImplWithArrayListTest {

    @Test
    void testPush() {
        StackImplWithArrayList stackImplWithArrayList = new StackImplWithArrayList();
        stackImplWithArrayList.push("guava");
        stackImplWithArrayList.push("mango");
        stackImplWithArrayList.push("apple");

        String result = stackImplWithArrayList.toString();

        assertThat(result).isEqualTo("StackImplWithArrayList[guava,mango,apple]");
    }

    @Test
    void testPop() {
        StackImplWithArrayList stackImplWithArrayList = new StackImplWithArrayList();
        stackImplWithArrayList.push("guava");
        stackImplWithArrayList.push("mango");
        stackImplWithArrayList.push("apple");

        String result = stackImplWithArrayList.pop();

        assertThat(stackImplWithArrayList.toString()).isEqualTo("StackImplWithArrayList[guava,mango]");
        assertThat(result).isEqualTo("apple");
    }

    @Test
    void testPeek() {
        StackImplWithArrayList stackImplWithArrayList = new StackImplWithArrayList();
        stackImplWithArrayList.push("guava");
        stackImplWithArrayList.push("mango");
        stackImplWithArrayList.push("apple");

        String result = stackImplWithArrayList.peek();

        assertThat(stackImplWithArrayList.toString()).isEqualTo("StackImplWithArrayList[guava,mango,apple]");
        assertThat(result).isEqualTo("apple");
    }

    @Test
    void testIsEmpty(){
        StackImplWithArrayList stackImplWithArrayList = new StackImplWithArrayList();
//        stackImplWithArrayList.push("guava");
//        stackImplWithArrayList.push("mango");
//        stackImplWithArrayList.push("apple");

        boolean result = stackImplWithArrayList.isEmpty();

//        assertFalse(result);
        assertTrue(result);
    }

    @Test
    void testMinElement() {
        StackImplWithArrayList stackImplWithArrayList = new StackImplWithArrayList();
//        stackImplWithArrayList.push("guava");
//        stackImplWithArrayList.push("apple");
//        stackImplWithArrayList.push("mango");
        stackImplWithArrayList.push("race");
        stackImplWithArrayList.push("RICE");

        String result = stackImplWithArrayList.minElement();

        assertThat(result).isEqualTo("race".toUpperCase());
    }
}