class Solution {
    public void deleteAlt(Node head) {
        // Code Here
        Node current =head;
        int c = 0;
        while(current!=null){
                if(current.next!=null){
                current.next = current.next.next;
                }
                if(current!=null){
                current = current.next;
                }
            }
        }
    }

/*
Examples :

Input: LinkedList: 1->2->3->4->5->6
 
Output: 1->3->5

Explanation: Deleting alternate nodes ie 2, 4, 6 results in the linked list with elements 1->3->5.
Input: LinkedList: 99->59->42->20
 
Output: 99->42
*/
