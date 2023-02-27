package Stack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.function.*;

public class Main {
    public static void main(String[] args){

        String str = "()()(((())))" ;// "()()((((()))))"; // (())((()))(())((((()))))
        int depth =1;
        int maxDepth = 0;
        Stack<String> stack = new Stack<>();

        for(int i = 0; i< str.length(); i++){
            String value = Character.toString(str.charAt(i));
            if(value.equals("(")){
                if(!stack.isEmpty()){
                    depth +=1;
                }
                if(depth > maxDepth){
                    maxDepth = depth;
                }
                stack.push(value);
            } else if(value.equals(")")){
                stack.pop();
                if(stack.isEmpty()){
                    depth =1;
                } else{
                    depth -=1;
                }
            }
        }

        System.out.println( "depth -> " + maxDepth);






        /*
        Comparable(old) & Comparator -> both for comparisons
        Comparable -> interface
        Comparator -> functional interface : use it as a lambda function
        functional interface has only one abstract method
        () -> {}

         */
//        Comparator
      /*  Function<Integer, Integer> f = v->v;
        Supplier<String> s = () -> "hey";
        Consumer<String> c = v -> System.out.println(v);
        Predicate<String> p = v -> true;
        List<String> test = new ArrayList<>()
        test.stream().
        */

    }
}
