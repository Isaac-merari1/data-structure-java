package org.merari.doubly;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedListImp doublyLinkedList = new DoublyLinkedListImp();

        // addFirst
        // guava -> <- mango -> <- pawpaw -> null
        doublyLinkedList.add("pawpaw");
        doublyLinkedList.add("mango");
        doublyLinkedList.add("guava");
        System.out.println(doublyLinkedList);

//        boolean result = doublyLinkedList.remove("watermelon");
//        System.out.println(result);

        // reverse
        List<String> data = doublyLinkedList.reverse();
        System.out.println(data);

//        System.out.println(doublyLinkedList);
    }

}