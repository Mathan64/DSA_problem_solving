class Solution {
    public Node insertInMiddle(Node head, int x) {
        // Code here
        Node nn= new Node(x);
        if(head==null)
          return nn;
        Node fast=head;
        Node slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        nn.next=slow.next;
        slow.next=nn;
        return head;
    }
}
/*
Input: LinkedList = 1->2->4 , x = 3
Output: 1->2->3->4
Explanation: 

The new element is inserted after the current middle element in the linked list.
Input: LinkedList = 10->20->40->50 , x = 30
Output: 10->20->30->40->50
Explanation: 

The new element is inserted after the current middle element in the linked list and Hence, the output is 10->20->30->40->50.
*/
