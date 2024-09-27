class Solution {
    // Function to check whether two linked lists are identical or not.
    public boolean areIdentical(Node head1, Node head2) {
        // write your code here
        while(head1!=null && head2!=null){
            if(head1.data!=head2.data)
             return false;
             head1= head1.next;
             head2= head2.next;
        }
        return (head1==null && head2==null);
    }
}

/*
Examples:

Input: LinkedList1: 1->2->3->4->5->6, LinkedList2: 99->59->42->20
Output: false
Explanation:

As shown in figure linkedlists are not identical.
Input: LinkedList1: 1->2->3->4->5, LinkedList2: 1->2->3->4->5
Output: true
Explanation: 
 
As shown in figure both are identical.
*/
