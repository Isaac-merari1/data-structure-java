package org.merari.doubly;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//@AllArgsConstructor
public class Node {
    private String data;
    private Node next;
    private Node previous;

    public Node(String data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}
