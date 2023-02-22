package Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class QueueWithLinkedListTest {
    private QueueWithLinkedList<String> QueueWithLinkedList;

    @BeforeEach
    void setUp(){
        QueueWithLinkedList = new QueueWithLinkedList<>();
    }
    @Test
    void enqueue() {
        QueueWithLinkedList.enqueue("apple");
        QueueWithLinkedList.enqueue("mango");
        QueueWithLinkedList.enqueue("orange");

        String result = QueueWithLinkedList.toString();

        assertThat(result).isEqualTo("QueueWithLinkedListImp[apple,mango,orange]");
    }

    @Test
    void dequeue() {
        QueueWithLinkedList.enqueue("apple");
        QueueWithLinkedList.enqueue("mango");
        QueueWithLinkedList.enqueue("orange");

        String dequeue = QueueWithLinkedList.dequeue();
        String result = QueueWithLinkedList.toString();

        assertThat(result).isEqualTo("QueueWithLinkedListImp[apple,mango]");
        assertThat(dequeue).isEqualTo("orange");

    }

    @Test
    void peek() {
        QueueWithLinkedList.enqueue("apple");
        QueueWithLinkedList.enqueue("mango");
        QueueWithLinkedList.enqueue("orange");

        String peek = QueueWithLinkedList.peek();
        String result = QueueWithLinkedList.toString();

        assertThat(result).isEqualTo("QueueWithLinkedListImp[apple,mango,orange]");
        assertThat(peek).isEqualTo("orange");
    }

    @Test
    void testException() {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = assertThrows(ArrayIndexOutOfBoundsException.class, QueueWithLinkedList::dequeue);
        assertEquals("Empty Queue", arrayIndexOutOfBoundsException.getMessage());
    }
}