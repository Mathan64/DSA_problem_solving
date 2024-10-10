class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if(head==null){
            return head;
        }
       if(x==1){
           return head.next;
       }
       Node current=head;
       for(int i=1;i<x-1&&current!=null;i++){
           current=current.next;
       }
       if(current==null||current.next==null){
           return head;
       }
       current.next=current.next.next;
       
       return head;
    }
}
/*
Examples:

Input: Linked list: 1 -> 3 -> 4, x = 3
Output: 1 -> 3

Explanation: After deleting the node at the 3rd position (1-base indexing), the linked list is as 1 -> 3. 
Input: Linked list: 1 -> 5 -> 2 -> 9, x = 2 
Output: 1 -> 2 -> 9
Explanation: After deleting the node at 2nd position (1-based indexing), the linked list is as 1 -> 2 -> 9.
*/
