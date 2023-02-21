package org.merari.doubly;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import LinkedList.circular.circular.CircularLinkedListImpl;
import LinkedList.circular.doubly.DoublyLinkedListImp;
import LinkedList.circular.doubly.Node;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DoublyLinkedListImpTest {

//    @org.junit.jupiter.api.Test
    @Test
    void reverse() {
        assertEquals("test", "test");
    }

    @Test
    @DisplayName("add(value, index): should add value at the front of the list")
    void testAddFirst() {
        DoublyLinkedListImp doublyLinkedListImp = new DoublyLinkedListImp();
        doublyLinkedListImp.addFirst("mango");
        doublyLinkedListImp.addFirst("guava");
        doublyLinkedListImp.addFirst("watermelon");

        String result = doublyLinkedListImp.toString();

        assertThat(result).isEqualTo("null <- watermelon ->  <- guava ->  <- mango -> null");
//        assertThat(doublyLinkedListImp.getSize(result)).isEqualTo(3);
    }


    @Test
    @DisplayName("add(value, index): should add value at the end of the list")
    void addLast() {
        DoublyLinkedListImp doublyLinkedListImp = new DoublyLinkedListImp();
        doublyLinkedListImp.addLast("mango");
        doublyLinkedListImp.addLast("guava");
        doublyLinkedListImp.addLast("watermelon");

        String result = doublyLinkedListImp.toString();

        assertThat(result).isEqualTo("null <- mango ->  <- guava ->  <- watermelon -> null");
//        assert
    }

    @Test
    @DisplayName("add(value, index): should add value to the list")
    void testAdd() {
        CircularLinkedListImpl circularSinglyLinkedList = new CircularLinkedListImpl();
        circularSinglyLinkedList.add("mango", 0);
        circularSinglyLinkedList.add("guava", 0);
        circularSinglyLinkedList.add("watermelon", 1);

        String result = circularSinglyLinkedList.toString();

        assertThat(result).isEqualTo("guava -> watermelon -> mango -> guava");
        assertThat(circularSinglyLinkedList.getSize()).isEqualTo(3);
    }


    @DisplayName("add(value, index): should add value to the list")
    @Test
    void tesRemoveFirst() {
        DoublyLinkedListImp doublyLinkedListImp = new DoublyLinkedListImp();
        doublyLinkedListImp.addLast("mango");
        doublyLinkedListImp.addLast("guava");
        doublyLinkedListImp.addLast("watermelon");

        doublyLinkedListImp.removeFirst();
        String result = doublyLinkedListImp.toString();

        assertThat(result).isEqualTo(" <- guava ->  <- watermelon -> null");
    }

    @Test
    @DisplayName("check if a value is found within the list")
    void testContains() {
        DoublyLinkedListImp doublyLinkedListImp = new DoublyLinkedListImp();
        doublyLinkedListImp.addLast("mango");
        doublyLinkedListImp.addLast("guava");
        doublyLinkedListImp.addLast("watermelon");
        boolean results = doublyLinkedListImp.contains("mango");

        assertThat(results).isEqualTo(true);
    }

    @Test
    @DisplayName("check if a value is found within the list")
    void tesGetSize() {
        Node node1 = new Node("orange");
        Node node2 = new Node("orange");
        Node node3 = new Node("orange");

        DoublyLinkedListImp doublyLinkedListImp = new DoublyLinkedListImp();

        int results = doublyLinkedListImp.getSize(node1);

        assertThat(results).isEqualTo(1);
    }
}