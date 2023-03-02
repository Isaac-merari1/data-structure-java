package Tree.binary;

import java.util.List;
import java.util.Stack;

public class Traversal {
    /**
     * preorder recursion
     * inorder recursion
     * postorder recursion
     * @param result
     * @param root
     */
    public static void preOrderRecursion(List<String> result, Node root){
        if(root == null){
            return;
        }
//        System.out.println(root.getLeft());
        result.add(root.getData());
        preOrderRecursion(result, root.getLeft());
        preOrderRecursion(result, root.getRight());

    }
    public static void inOrderRecursion(List<String> result, Node root){
        if(root == null){
            return;
        }
        inOrderRecursion(result, root.getLeft());
        result.add(root.getData());
//        System.out.println(root.getLeft());
        inOrderRecursion(result, root.getRight());

    }  public static void postOrderRecursion(List<String> result, Node root){
        if(root == null){
            return;
        }
        postOrderRecursion(result, root.getLeft());
        postOrderRecursion(result, root.getRight());
        result.add(root.getData());
//        System.out.println(root.getLeft());

        /**
         * level Order Recursion Uses Iteration
         */
    }
    public static void levelOrderRecursion(List<Integer> result, Node root){
        if(root == null){
            return;
        }
        System.out.println(root.getLeft());
        levelOrderRecursion(result, root.getLeft());
        levelOrderRecursion(result, root.getRight());

    }

    /**
     * Using iteration for preorder, postorder and inorder
     */

    public static void preOrderIteration(List<String> result, Node root){
        /**
         * print the node
         */
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while(current != null || !stack.isEmpty()){
            if(current != null){
                result.add(current.getData());
                stack.push(current);
                current = current.getLeft();
            } else{
                Node node = stack.pop();
                current = node.getRight();
            }
        }
    }
    public static void InOrderIteration(List<String> result, Node root){
        /**
         * print the node
         */
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while(current != null || !stack.isEmpty()){
            if(current != null){
                result.add(current.getData());
                current = current.getLeft();
            } else{
                Node node = stack.pop();
                stack.push(current);
                current = node.getRight();
            }
        }
    }
    public static void postOrderIteration(List<String> result, Node root){
        /**
         * print the node
         */
        Stack<Node> tempStack = new Stack<>();
        Stack<String> valueStack = new Stack<>();
        tempStack.add(root);

        while(!tempStack.isEmpty()){
           Node node = tempStack.pop();
            valueStack.push(node.getData());
            if(node.getLeft() != null){
                tempStack.push(node.getLeft());
            }
            if(node.getRight() != null){
                tempStack.push(node.getRight());
            }
        }
        while(!valueStack.isEmpty()){
            String value = valueStack.pop();
            result.add(value);
        }

    }

}
