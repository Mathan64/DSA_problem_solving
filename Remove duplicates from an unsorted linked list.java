class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // Your code here
        if(head==null){
            return head;
        }
        Node current = head;
        Node pre = null;
        
        HashSet<Integer> set = new HashSet<>();
    
      while(current!=null){
          if(set.contains(current.data)){
              pre.next = current.next;
          }
          else{
              set.add(current.data);
              pre = current;
          }
          current = current.next;
      }
      return head;
    }
}
/*
Input: LinkedList: 5->2->2->4
Output: 5->2->4
Explanation: Given linked list elements are 5->2->2->4, in which 2 is repeated only. So, we will delete the extra repeated elements 2 from the linked list and the resultant linked list will contain 5->2->4
 
Input: LinkedList: 2->2->2->2->2
Output: 2
Explanation:Given linked list elements are 2->2->2->2->2, in which 2 is repeated. So, we will delete the extra repeated elements 2 from the linked list and the resultant linked list will contain only 2.
*/
