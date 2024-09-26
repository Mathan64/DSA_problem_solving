class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        Node newnode = new Node(x);
        if(head==null)
          return newnode;
          Node t = head;
          while(t.next!=null){
              t=t.next;
          }
          t.next=newnode;
          return head;
    }
}
/*
Input: LinkedList: 1->2->3->4->5 , x = 6
Output: 1->2->3->4->5->6
Explanation: 

We can see that 6 is inserted at the end of the linkedlist.
Input: LinkedList: 5->4 , x = 1
Output: 5->4->1
Explanation: 

We can see that 1 is inserted at the end of the linkedlist.
*/
