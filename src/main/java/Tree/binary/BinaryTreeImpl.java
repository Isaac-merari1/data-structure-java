package Tree.binary;

/*
   Non-linear Data structure
   Tree Traversals (Inorder, Preorder and Postorder) Depth First Search
   level order Breadth First Search
*/

import java.util.Scanner;

public class BinaryTreeImpl {
   private Node Root;
   private final Scanner scanner = new Scanner(System.in);
   public Node create (){
       /**
        *            2
        *          /  \
        *        4      6
        */

       System.out.println("Enter a value data: ");
       String value = scanner.next();
       Node root = new Node(value);

       System.out.printf("does %s it have left child? y/n: ", value);
       String answer = scanner.next();
       if(answer.equals("y")){
           root.setLeft(create());
       }

       System.out.printf("does %s it have right child? y/n: ", value);
       answer = scanner.next();

       if(answer.equals("y")){
           root.setRight(create());
       }
       return root;
   }

}
