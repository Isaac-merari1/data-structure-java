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

    /**
     * To delete a key from a binary tree in Java, you can follow these general steps:
     *
     * Start at the root node of the tree.
     * Search for the node containing the key to be deleted.
     * If the node is found, check if it has any children.
     * If the node has no children, simply remove it from the tree.
     * If the node has one child, replace the node with its child.
     * If the node has two children, find the node with the minimum value in the right subtree (or the maximum value in the left subtree) and replace the node to be deleted with this node. Then delete the node with the minimum (or maximum) value from the right (or left) subtree.
     * Update the parent pointers of any affected nodes.
     * Here is an example implementation of a method to delete a node with a given key from a binary search tree in Java
     */

    public binaryNode deleteNode(binaryNode root, int key) {
        // base case: tree is empty
        if (root == null) {
            return null;
        }

        // search for the node to be deleted
        if (key < root.key) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.key) {
            root.right = deleteNode(root.right, key);
        } else {
            // node to be deleted found
            if (root.left == null) {
                // node has no left child
                return root.right;
            } else if (root.right == null) {
                // node has no right child
                return root.left;
            } else {
                // node has two children
                binaryNode minRight = findMin(root.right);
                root.key = minRight.key;
                root.right = deleteNode(root.right, minRight.key);
            }
        }

        return root;
    }

    private binaryNode findMin(binaryNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}

class binaryNode{
    public int key;
    public binaryNode left;
    public binaryNode right;

    public binaryNode(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }


}
