package Queue;

import java.util.LinkedList;

public class QueueWithLinkedList<Q> {
    private final LinkedList<Q> data;

    public QueueWithLinkedList() {
        this.data = new LinkedList<Q>();
    }

    public Q enqueue(Q value){
        data.addLast(value);
        return value;
    }

    public Q dequeue(){
        if(!data.isEmpty()){
            return data.removeLast();
        }
        throw new ArrayIndexOutOfBoundsException("Empty Queue");
    }

    public Q peek(){
        if(!data.isEmpty()){
            return data.getLast();
        }
        throw new ArrayIndexOutOfBoundsException("Empty Queue");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("QueueWithLinkedListImp[");
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
