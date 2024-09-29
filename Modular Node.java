class Solution {
    public int modularNode(Node head, int k) {
        // Code here//Position this line where user code will be pasted.
        if(head==null)
            return -1;
            Node slow =null;
            Node fast = head;
            int i=1;
            while(fast!=null){
                if(i%k==0){
                    slow=fast;
                }
                fast=fast.next;
                i++;
            }
            return (slow!=null)?slow.data:-1;
    }
}
/*
Examples :

Input: LinkedList: 1->2->3->4->5->6->7 , k = 3
 
Output: 6
Explanation: Indexing of the linked list is same as the values of the Node. The maximum index which is divisble by 3 is 6 and the
node value of the 6th index is 6.
Input: LinkedList: 19->28->37->46->55 , k = 13

Output: -1
Explanation: Index start from 1 and end at 5. There is no index which can divisible by 13, so output is -1.
*/
