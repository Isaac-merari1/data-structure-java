package LinkedList.circular.singly;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class Solution {
//    public ListNode middleNode(ListNode head) {
//
//    }
//}
public class MiddleLinkedListChallenge {

  public ListNode middleNode(ListNode node){
    int size = getSize(node);
    ListNode currentNode = node;
    for(int i =0; i <size/2; i++){
        currentNode = currentNode.next;
        System.out.println(currentNode);
    }
    return currentNode;
  }

  public ListNode usingSlowFastApproach(ListNode node){
      ListNode current = node;
      ListNode slow = current;
      ListNode fast = current;
      while(fast != null && fast.next != null){
          slow = slow.next;
          fast = fast.next.next;
      }
      System.out.println(slow);

      return slow;
  }
    private int getSize(ListNode node){
        int size = 0;
        while(node != null){
            node = node.next;
            size ++;
        }
        return size;
    }

}
