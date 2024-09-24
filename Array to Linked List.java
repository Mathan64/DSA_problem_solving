class Solution {
    static Node constructLL(int arr[]) {
        // code here
        Node head = new Node(arr[0]);
        Node move = head;
        for(int i=1;i<arr.length;i++){
          Node t = new Node(arr[i]);
          move.next=t;
          move = t;
        }
      return head;  
    }
}
/*
Input: arr = [1, 2, 3, 4, 5]
Output: LinkedList: 1->2->3->4->5
Explanation: Linked list for the given array will be

Input: arr = [2, 4, 6, 7, 5, 1, 0]
Output: LinkedList: 2->4->6->7->5->1->0
Explanation: Linked list for the given array will be

*/
