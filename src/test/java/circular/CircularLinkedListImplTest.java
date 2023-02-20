package circular;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class CircularLinkedListImplTest {

    @Test
    @DisplayName("should return empty list if no value added to list")
    void test_empty_list() {
        CircularLinkedListImpl circularSinglyLinkedList = new CircularLinkedListImpl();

        String result = circularSinglyLinkedList.toString();

        assertThat(result).isEqualTo("empty list");
    }

    @Test
    @DisplayName("addFirst(value): should add value at the beginning of the list")
    void test_addFirst() {
        CircularLinkedListImpl circularSinglyLinkedList = new CircularLinkedListImpl();
        circularSinglyLinkedList.addFirst("mango");
        circularSinglyLinkedList.addFirst("guava");
        circularSinglyLinkedList.addFirst("watermelon");

        String result = circularSinglyLinkedList.toString();

        assertThat(result).isEqualTo("watermelon -> guava -> mango -> watermelon");
        assertThat(circularSinglyLinkedList.getSize()).isEqualTo(3);
    }

    @Test
    @DisplayName("addLast(value): should add value at the end of the list")
    void test_addLast() {
        CircularLinkedListImpl circularSinglyLinkedList = new CircularLinkedListImpl();
        circularSinglyLinkedList.addLast("mango");
        circularSinglyLinkedList.addLast("guava");
        circularSinglyLinkedList.addLast("watermelon");

        String result = circularSinglyLinkedList.toString();

        assertThat(result).isEqualTo("mango -> guava -> watermelon -> mango");
        assertThat(circularSinglyLinkedList.getSize()).isEqualTo(3);
    }

    @Test
    @DisplayName("add(value, index): should add value at specified index")
    void test_add() {
        CircularLinkedListImpl circularSinglyLinkedList = new CircularLinkedListImpl();
        circularSinglyLinkedList.add("mango", 0);
        circularSinglyLinkedList.add("guava", 0);
        circularSinglyLinkedList.add("watermelon", 1);

        String result = circularSinglyLinkedList.toString();

        assertThat(result).isEqualTo("guava -> watermelon -> mango -> guava");
        assertThat(circularSinglyLinkedList.getSize()).isEqualTo(3);
    }
}