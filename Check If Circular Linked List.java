class Solution {
    boolean isCircular(Node head) {
        if (head == null) {
            return true;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
/*
Examples:

Note: In the input format, k = 1 indicates the presence of a cycle; otherwise, k = 0, followed by the linked list values on a new line.

Input: k=1, LinkedList: 2->4->6->7->5

Output: true
Explanation: As shown in figure the first and last node is connected, i.e. 5 --> 2
Input: k=0, LinkedList: 2->4->6->7->5->1
 
Output: false
Explanation: As shown in figure this is not a circular linked list.
*/
