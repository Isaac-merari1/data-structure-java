package singly;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        MiddleLinkedListChallenge middleLinkedListChallenge = new MiddleLinkedListChallenge();
        ListNode ListNode1 = new ListNode(1);
        ListNode ListNode2 = new ListNode(2);
        ListNode ListNode3 = new ListNode(3);

        middleLinkedListChallenge.middleNode(ListNode1);
        middleLinkedListChallenge.middleNode(ListNode2);
        middleLinkedListChallenge.middleNode(ListNode3);

//        middleLinkedListChallenge.usingSlowFastApproach(ListNode1);
//        middleLinkedListChallenge.usingSlowFastApproach(ListNode2);
//        middleLinkedListChallenge.usingSlowFastApproach(ListNode3);

//        System.out.println(middleLinkedListChallenge);
    }

}