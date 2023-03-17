package Tree.binary;

import java.util.Scanner;

class searchNode{
    public int data;
    public searchNode left;
    public searchNode right;

    public searchNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return String.format("[%s l=%s r=%s]", data, left, right);
    }
}


public class BinarySearchTreeImpl {
    /**
     * Binary has a runtime of log N
     */
    private searchNode root;

    public searchNode getRoot() {
        return root;
    }

    public void insert(int value){
        root = _add(root, value);
     }
    private searchNode _add(searchNode node, int value){
        if(node == null){
            return new searchNode(value);
        }
        if(value < node.data){
            node.left = _add(node.left, value);
        } else{
            node.right = _add(node.right, value);
        }

        return node;
    }

    public int binarySearchRecursion(int value){
        return _searchRecursion(root, value);
    }

    private int _searchRecursion(searchNode node, int value){
        /**
         * get middle of  tree (start from root)
         * if root is equal to value, then return value
         * if root is greater than value, then you search left of root
         * if root is less than value, then you search right of root
         */
        if(node == null){
            return -1;
        }

        if(node.data == value){
            return 1;
        }

        if(value < node.data){
            return _searchRecursion(node.left, value);
        }

         return _searchRecursion(node.right, value);
    }

    public int binarySearchIteration(int value){
        searchNode current = root;
        while(current != null){
            if(current.data == value){
                return 1;
            }
            if(value < current.data){
                current = current.left;
            }
            current = current.right;
        }
        return -1;
    }

    public void delete(int value){
      int result = _searchRecursion(root,value);
      if(result == 1){
          _delete(root, value);
      }
    }
    private void _delete(searchNode node, int value){
        /**
         *         4
         *       /  \
         *      2    8
         *          /  \
         *         5    9
         */

        if(root == null){
            return;
        }
        searchNode current = node;
        searchNode previous  = node;

        while(current != null && current.data != value){
            previous = current;
            if(value > current.data){
                current = current.right;
            } else{
                current = current.left;
            }
        }

        if(current == null){
            return;
        }

        if(current.left == null && current.right == null){
            if(previous.data == current.data){
                previous.left = null;
            } else{
                previous.right = null;
            }
        } else if(current.left == null){
            if(current.data > previous.data){
                previous.right = current.right;
            } else{
                previous.left = current.right;
            }
        }
        else if(current.right == null){
            if(current.data > previous.data){
                previous = previous.left;
            }
        } else{
            searchNode minNode = findMinValue(current.right);
            _delete(previous, minNode.data);
            current.data = minNode.data;
        }
    }

    private searchNode findMinValue(searchNode node){
        while(node.left != null){
            node = node.left;
        }
        return node;
    }

}
