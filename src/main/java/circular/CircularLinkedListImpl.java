package circular;

public class CircularLinkedListImpl {
    private Node head;
    private Node tail;
    private int size;

    public void addFirst(String value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.setNext(head);
        } else {
            Node previousHead = head;
            newNode.setNext(previousHead);
            tail.setNext(newNode);
            head = newNode;
        }
        size += 1;
    }

    public void addLast(String value) {
        if (head == null) {
            addFirst(value);
        } else {
            Node newNode = new Node(value);
            Node previousTail = tail;
            previousTail.setNext(newNode);
            tail = newNode;
            newNode.setNext(head);
            size += 1;
        }
    }

    public void add(String value, int index) {
        if (!indexInRange(index)) {
            return;
        }

        if (index == 0) {
            addFirst(value);
            return;
        }

        if (index == size) {
            addLast(value);
            return;
        }

        Node newNode = new Node(value);
        Node currentNode = head;

        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.getNext();
        }

        newNode.setNext(currentNode.getNext());
        currentNode.setNext(newNode);
        size += 1;
    }

    private boolean indexInRange(int index) {
        return index >= 0 && index <= getSize();
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "empty list";
        }

        StringBuilder builder = new StringBuilder();
        Node currentNode = head;

        do {
            builder.append(currentNode.getData())
                    .append(" -> ");
            if (currentNode.getNext() == head) {
                builder.append(head.getData());
            }
            currentNode = currentNode.getNext();
        } while (currentNode != head);

        return builder.toString();
    }
}
