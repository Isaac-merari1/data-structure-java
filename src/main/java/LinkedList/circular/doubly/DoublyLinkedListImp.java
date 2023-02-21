package LinkedList.circular.doubly;


import java.util.ArrayList;
import java.util.List;

public class DoublyLinkedListImp {
    private Node head;

    public List<String> reverse(){
        ArrayList<String> list = new ArrayList<>();

        Node forwardNode = head;
        while(forwardNode.getNext() != null){
            forwardNode = forwardNode.getNext();
        }
        Node backwardNode = forwardNode;
        while (backwardNode != null && backwardNode.getData() != null){
            list.add(backwardNode.getData());
            backwardNode = backwardNode.getPrevious();
        }
        return list;
    }

    public void addFirst(String value){
        Node newNode = new Node(value);
        if(head != null){
            Node currentNode = head;
            newNode.setNext(currentNode);
            currentNode.setPrevious(newNode);
        }
        head = newNode;
    }

    public void add(String value){
        addFirst(value);
    }

    public void addLast(String value){
        Node newNode = new Node(value);
        if(head != null){
            Node last = head;
            while(last.getNext()  != null){
                last = last.getNext();
            }
            last.setNext(newNode);
            newNode.setPrevious(last);
            newNode.setNext(null);
        }
        else{
            head = newNode;
        }
    }

    public void add(int index, String value){
        int size = this.getSize(head);
        if(index == 0){
            this.addFirst(value);
            return;
        }
        if(index == size){
            this.addLast(value);
            return;
        }
        if(index > 0 && index < size){
            Node newNode = new Node(value);
            Node currentNode = head;
            while(--index > 0){
                currentNode = currentNode.getNext();
            }
            Node nextNode = currentNode.getNext();
            nextNode.setPrevious(newNode);
            newNode.setNext(nextNode);
            newNode.setPrevious(currentNode);
        }
    }

    public boolean removeFirst(){
        if(head != null){
            Node remove = head;
            head = remove.getNext();
            remove.setNext(null);
            return true;
        }
        return false;
    }

    public void remove(int index, String value){
        int size = this.getSize(head);
        if(index == 0){
            this.removeFirst();
            return;
        }
//        if(index == size){
//            this.removeLast();
//            return;
//        }
        if((index > 0) && (index < size)){
            Node currentNode = head;

            while(--index > 0){
                currentNode = currentNode.getNext();
            }
            Node netxNode = currentNode.getNext();
            netxNode.setNext(null);
            netxNode.setPrevious(currentNode);
            currentNode.setPrevious(null);
            currentNode.setNext(netxNode);

        }
    }

    public boolean remove(String value) {
        // list is empty
        if (head == null) {
            return false;
        }
        // if value does not exist
        if (!contains(value)) {
            return false;
        }
        // value exists
        // 1. value is the head
        if (head.getData().equals(value)) {
            Node currentNode = head;
            head = head.getNext();
            currentNode.setNext(null);
        } else {
            // 2. remove at last
            // 3. remove at anywhere middle
            Node currentNode = head;
            while (!currentNode.getData().equals(value)) {
                currentNode = currentNode.getNext();
            }
            Node previous = currentNode.getPrevious();
            previous.setNext(currentNode.getNext());
        }
        return true;
    }
    public boolean contains(String value){
        Node currentNode = head;
        if(currentNode == null){
            return false;
        }
        while(currentNode != null && currentNode.getData() != null && !currentNode.getData().equals(value)){
            currentNode = currentNode.getNext();
        }
        return true;
    }

    public int getSize(Node node){
        int size = 0;
        while(node != null){
            node = node.getNext();
            size ++;
        }
        return size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.getPrevious() == null) {
                builder.append("null");
            }
            builder.append(" <- ").append(currentNode.getData()).append(" -> ");
            currentNode = currentNode.getNext();
        }
        builder.append("null");
        return builder.toString();
    }
}
