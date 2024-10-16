class Solution {
    public static int count(Node head, int key) {
        // code here
        int c=0;
        Node current =head;
        while(current!=null){
            if(current.data==key)
             c++;
            current=current.next;
        }
        return c;
    }
}

/*
Examples:

Input: Linked List: 1->2->1->2->1->3->1, key = 1

Output: 4
Explanation: 1 appears 4 times. 
Input: Linked List: 1->2->1->2->1, key = 3

Output: 0
Explanation: 3 appears 0 times.
*/
