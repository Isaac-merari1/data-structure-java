package Stack;

import java.util.LinkedList;
import java.util.List;

public class StackWithLinkedList<E> {
    private final LinkedList<E> data;

    public StackWithLinkedList() {
        this.data = new LinkedList<>();
    }

    public E push(E value){
        data.add(value);
        return value;
    }

    public E pop(){
//        return data.remove(data.size()-1);
        return data.removeLast();
    }

    public E peek(){
//        return data.get(data.size()-1);
        return data.getLast();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("StackImplWithLinkedList[");
        for(int i =0; i<data.size(); i++){
            builder.append(data.get(i));
            if(i != data.size() -1){
                builder.append(",");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
