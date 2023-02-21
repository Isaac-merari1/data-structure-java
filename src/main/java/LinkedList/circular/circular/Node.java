package LinkedList.circular.circular;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {
    private String data;
    private Node next;

    public Node(String data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(String data) {
        this(data, null);

    }
}
