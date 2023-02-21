package LinkedList.circular.doubly;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedListImp doublyLinkedList = new DoublyLinkedListImp();

        // addFirst
        // guava -> <- mango -> <- pawpaw -> null
//        doublyLinkedList.addLast("pawpaw");
//        doublyLinkedList.addLast("mango");
//        doublyLinkedList.addLast("guava");
//        System.out.println(doublyLinkedList);

//        boolean result = doublyLinkedList.remove("watermelon");
//        System.out.println(result);

        // reverse
//        List<String> data = doublyLinkedList.reverse();
//        System.out.println(data);

//        doublyLinkedList.addFirst("mango");
//        doublyLinkedList.addFirst("guava");
//        doublyLinkedList.addFirst("watermelon");

        doublyLinkedList.addLast("mango");
        doublyLinkedList.addLast("guava");
        doublyLinkedList.addLast("watermelon");

        doublyLinkedList.removeFirst();


        System.out.println(doublyLinkedList);
    }

}