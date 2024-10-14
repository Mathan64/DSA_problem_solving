class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        if(head==null||head.next==null){
            return head;
        }
        Node current = head;
        int c0=0;
        int c1=0;
        int c2=0;
        while(current!=null){
            if(current.data==0){
                c0++;
            }
            else if(current.data==1){
                c1++;
            }
            else{
                c2++;
            }
            current = current.next;
        }
        current = head;
        while(c0>0){
            current.data = 0;
            c0--;
            current =current.next;
        }
        while(c1>0){
             current.data = 1;
             c1--;
             current =current.next;
            
        }while(c2>0){
            current.data = 2;
             c2--;
            current =current.next;
        }
        return head;
    }
}

/*
Examples:

Input: LinkedList: 1->2->2->1->2->0->2->2
Output: 0->1->1->2->2->2->2->2
Explanation: All the 0s are segregated to the left end of the linked list, 2s to the right end of the list, and 1s in between.
 
Input: LinkedList: 2->2->0->1
Output: 0->1->2->2
Explanation: After arranging all the 0s,1s and 2s in the given format, the output will be 0 1 2 2.
*/
