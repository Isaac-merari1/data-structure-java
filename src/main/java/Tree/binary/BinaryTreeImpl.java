package Tree.binary;

/*
   Non-linear Data structure
   Tree Traversals (Inorder, Preorder and Postorder) Depth First Search
   level order Breadth First Search
*/

import java.util.Scanner;

public class BinaryTreeImpl {
    private final Scanner scanner;

    public BinaryTreeImpl() {
        scanner = new Scanner(System.in);
    }
//   private Node Root;


    public BinaryTreeImpl(Scanner scanner) {
        this.scanner = scanner;
//        Node root = new Node(value);
    }
   public binaryNode create (){
       /**
        *            2
        *          /  \
        *        4      6
        */

       System.out.println("Enter a value data: ");
       int value = scanner.nextInt();
       binaryNode root = new binaryNode(value);

       System.out.printf("does %s it have left child? y/n: ", value);
       String answer = scanner.next();
       if(answer.equals("y")){
           root.left = create();
       }

       System.out.printf("does %s it have right child? y/n: ", value);
       answer = scanner.next();

       if(answer.equals("y")){
           root.right = create();
       }
       return root;
   }

    /**
     * To delete a key from a binary tree in Java, you can follow these general steps:
     *
     * Start at the root node of the tree.
     * Search for the node containing the key to be deleted.
     * If the node is found, check if it has any children.
     * If the node has no children, simply remove it from the tree.
     * If the node has one child, replace the node with its child.
     * If the node has two children,
     * find the node with the minimum value in the right subtree (or the maximum value in the left subtree)
     * and replace the node to be deleted with this node.
     * Then delete the node with the minimum (or maximum) value from the right (or left) subtree.
     * Update the parent pointers of any affected nodes.
     * Here is an example implementation of a method to delete a node with a given key from a binary search tree in Java
     *
     *                       Binary Tree Before Deletion
     *                                    3
     *                                  /   \
     *                                2      5
     *                               / \    / \
     *                              1   6  4   8
     *                                        / \
     *                                       7   9
     *
     *                       Binary Tree After Deletion
     *
     *                                           3
     *      *                                  /   \
     *      *                                 6     5
     *      *                               /      / \
     *      *                              1      4   8
     *      *                                        / \
     *      *                                       7   9
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

    @Override
    public String toString() {
        return String.format("[%s l=%s r=%s]", key, left, right);
    }







}
