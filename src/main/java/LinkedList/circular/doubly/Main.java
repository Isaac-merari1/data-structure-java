package LinkedList.circular.doubly;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {
    static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) {
        logger.setLevel(Level.OFF);
//        logger.setLevel(Level.INFO);
//        logger.log(Level.SEVERE, "MY SEVERE");
//        logger.log(Level.WARNING, "MY WARNING LOG");
//        logger.log(Level.INFO, "MY LOG");
//        logger.log(Level.CONFIG, "MY LOG");
//        logger.log(Level.FINE, "MY LOG");
//        logger.log(Level.FINER, "MY LOG");
//        logger.log(Level.FINEST, "MY LOG");
//        logger.log(Level.ALL, "MY LOG");
//        // parameterized message
//        logger.log(Level.INFO, "{0} is {1} days from {2}", new Object[]{"wed",2, "Fri"});
        doSomething("kofi", "Ama");



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
        //system property
        System.out.println("user home - " + System.getProperty("user.name"));
    }
    static void doSomething(String left, String right){
        logger.entering("Main", "doSomething", new Object[]{left, right});
    }

}