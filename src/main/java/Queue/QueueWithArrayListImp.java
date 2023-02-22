package Queue;

import java.util.ArrayList;

public class QueueWithArrayListImp<Q> {
    private final ArrayList<Q> data;

    public QueueWithArrayListImp() {
        this.data = new ArrayList<Q>();
    }

    public Q enqueue(Q value){
        data.add(value);
        return value;
    }

    public Q dequeue(){
        if(data.isEmpty()){
            throw new ArrayIndexOutOfBoundsException("Empty Queue");
        }
        return data.remove(0);
    }

    public Q peek(){
        if(data.isEmpty()){
            throw new ArrayIndexOutOfBoundsException("Empty Queue");
        }
        return data.get(0);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("QueueWithArrayListImp[");
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
