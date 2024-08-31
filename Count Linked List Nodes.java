class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        int cnt = 0;
        Node temp = head;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }
       
        return cnt;
    }
}

/*
Examples :

Input: LinkedList : 1->2->3->4->5

Output: 5
Explanation: Count of nodes in the linked list is 5, which is its length.
Input: LinkedList : 2->4->6->7->5->1->0
 
Output: 7
Explanation: Count of nodes in the linked list is 7. Hence, the output is 7.
*/
