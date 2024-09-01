class Solution {
    // Function to reverse a linked list.
    Node reverseList(Node head) {
        // code here
      Node pre=null;
      Node curr=head;
      Node next=head.next;
      while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre= curr;
            curr=next;
      }
      head=pre;
      return head;
    }
}

/*
Examples:

Input: Linked list: 1->2->3->4->5->6
Output: 6->5->4->3->2->1
Explanation:

Input: Linked list: 2->7->10->9->8 
Output: 8->9->10->7->2
Explanation:

Input: Linked List: 10
Output: 10
Explanation: For a single node list, the reverse would be same as original
*/
