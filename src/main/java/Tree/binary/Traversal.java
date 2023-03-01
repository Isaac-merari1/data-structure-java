package Tree.binary;

import java.util.List;

public class Traversal {
    /**
     * preorder recursion
     * inorder recursion
     * postorder recursion
     * @param result
     * @param root
     */
    public static void preOrderRecursion(List<Integer> result, Node root){
        if(root == null){
            return;
        }
        System.out.println(root.getLeft());
        preOrderRecursion(result, root.getLeft());
        preOrderRecursion(result, root.getRight());

    }  public static void inOrderRecursion(List<Integer> result, Node root){
        if(root == null){
            return;
        }
        inOrderRecursion(result, root.getLeft());
        System.out.println(root.getLeft());
        inOrderRecursion(result, root.getRight());

    }  public static void postOrderRecursion(List<Integer> result, Node root){
        if(root == null){
            return;
        }
        postOrderRecursion(result, root.getRight());
        System.out.println(root.getLeft());
        postOrderRecursion(result, root.getLeft());

        /**
         * level Order Recursion Uses Iteration
         */
    }  public static void levelOrderRecursion(List<Integer> result, Node root){
        if(root == null){
            return;
        }
        System.out.println(root.getLeft());
        levelOrderRecursion(result, root.getLeft());
        levelOrderRecursion(result, root.getRight());

    }

}
