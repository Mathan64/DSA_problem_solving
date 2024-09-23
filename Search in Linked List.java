class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        while(n!=0){
           if(head.data==key) 
             return true;
             head = head.next;
             n--;
        }
        return false;
    }
}
/*
Example:

Input:
n = 4
1->2->3->4
Key = 3
Output:
True
Explanation:
3 is present in Linked List, so the function returns true.
*/
