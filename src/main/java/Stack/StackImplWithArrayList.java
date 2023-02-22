package Stack;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/*
    first in last out approach
    methods
    pop , push, peek

 */
//@ToString
public class StackImplWithArrayList {
    private final List<String> data ;

    public StackImplWithArrayList() {
        this.data = new ArrayList<>();
    }

//   Push -> Pushes an element on the top of the stack.
    public String push(String value){
        data.add(value);
        return value;
    }

    public String pop(){
        return data.remove(data.size()-1);
    }

    public String peek(){
        return data.get(data.size()-1);
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }

    public String minElement(){
         return  data.stream()
//                 .min((a,b) -> a.compareTo(b))
                 .min(String::compareTo)
                 .orElse("");
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("StackImplWithArrayList[");
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
