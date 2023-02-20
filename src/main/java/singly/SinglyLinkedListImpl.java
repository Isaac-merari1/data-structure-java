package singly;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SinglyLinkedListImpl {
    private Node head;

    public void addFirst(String value) {
        Node newNode = new Node(value, null);
        if (!isEmpty()) {
            newNode.setNext(head);
        }
        this.head = newNode;
    }

    public void add(String value) {
        Node newNode = new Node(value, null);
        if (isEmpty()) {
            this.head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
    }

    public boolean remove(String value) {
        // empty linkedlist
        if (isEmpty()) {
            return false;
        }
        // value does not exist
        if (!contains(value)) {
            return false;
        }
        // value is head -> delete from head
        if (head.getData().equals(value)) {
            Node currentNode = head;
            head = head.getNext();
            currentNode.setNext(null);
        } else {
            // value is tail or middle
            Node currentNode = head;
            while (!currentNode.getNext().getData().equals(value)) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(currentNode.getNext().getNext());
        }
        return true;
    }

    private boolean contains(String value) {
        Node currentNode = head;
        if (currentNode.getData().equals(value)) {
            return true;
        }

        currentNode = currentNode.getNext();
        while (currentNode != null && !currentNode.getData().equals(value)) {
            currentNode = currentNode.getNext();
        }

        return true;
    }

    private boolean isEmpty() {
        return this.head == null;
    }

    public List<String> reverse() {
        ArrayList<String> list = new ArrayList<>();

        Stack<String> fruits = new Stack<>();
        Node currentNode = head;
        while (currentNode != null) {
            fruits.push(currentNode.getData());
            currentNode = currentNode.getNext();
        }
        while (!fruits.isEmpty()) {
            list.add(fruits.pop());
        }
        return list;
    }
}
