package Queue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class QueueWithArrayListImpTest {
    private QueueWithArrayListImp<String> queueWithArrayListImp;

    @BeforeEach
    void setUp() {
        queueWithArrayListImp = new QueueWithArrayListImp<String>();
    }

    @Test
    void enqueue() {
        queueWithArrayListImp.enqueue("mango");
        queueWithArrayListImp.enqueue("orange");
        queueWithArrayListImp.enqueue("apple");

        String result = queueWithArrayListImp.toString();

        assertThat(result).isEqualTo("QueueWithArrayListImp[mango,orange,apple]");
    }

    @Test
    void dequeue() {
        queueWithArrayListImp.enqueue("mango");
        queueWithArrayListImp.enqueue("orange");
        queueWithArrayListImp.enqueue("apple");

        String dequeue = queueWithArrayListImp.dequeue();

        String result = queueWithArrayListImp.toString();

        assertThat(result).isEqualTo("QueueWithArrayListImp[orange,apple]");
        assertThat(dequeue).isEqualTo("mango");
    }

    @Test
    void peek() {
        queueWithArrayListImp.enqueue("mango");
        queueWithArrayListImp.enqueue("orange");
        queueWithArrayListImp.enqueue("apple");

        String peek = queueWithArrayListImp.peek();

        String result = queueWithArrayListImp.toString();

        assertThat(result).isEqualTo("QueueWithArrayListImp[mango,orange,apple]");
        assertThat(peek).isEqualTo("mango");
    }

    @Test
    void testException() {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = assertThrows(ArrayIndexOutOfBoundsException.class, queueWithArrayListImp::dequeue);
        assertEquals("Empty Queue", arrayIndexOutOfBoundsException.getMessage());
    }
}