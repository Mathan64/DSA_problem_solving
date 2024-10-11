class Solution {
    void deleteNode(Node node) {
        // Your code here
        if(node==null ||node.next==null){
            return;
        }
        node.data=node.next.data;
        node.next=node.next.next;
    
    }
}
/*
Examples:

Input: Linked List = 1 -> 2, del_node = 1
Output: 2
Explanation: After deleting 1 from the linked list, we have remaining nodes as 2.
 
Input: Linked List = 10 -> 20 -> 4 -> 30, del_node = 20
Output: 10->4->30
Explanation: After deleting 20 from the linked list, we have remaining nodes as 10, 4, 30.
*/
