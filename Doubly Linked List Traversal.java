public static ArrayList<Integer> displayList(Node head)
{
    // your code here
    ArrayList<Integer>al=new ArrayList<>();
    Node temp=head;
    while(temp!=null)
    {
        al.add(temp.data);
        temp=temp.next;
    }
    return al;   
}
/*
Examples:
Input: LinkedList: 1<->2<->3<->4<->5
Output:
[1, 2, 3, 4, 5]
[5, 4, 3, 2, 1]
Explanation: After traversing forward the linked list will look like [1, 2, 3, 4, 5] and from backward will [5, 4, 3, 2, 1].
Input: LinkedList: 34<->22
Output:
[34, 22]
[22, 34]
Explanation: After traversing forward the linked list will look like [34, 22] and from backward will [22, 34].
*/
