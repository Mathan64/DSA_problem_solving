class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack <Integer> s = new Stack<>();
        while(q.size()>0){
            s.push(q.poll());
        }
        while(s.size()>0){
            q.add(s.pop());
        }
        return q;
    }
}

/*
Example 1:

Input:
6
4 3 1 10 2 6
Output: 
6 2 10 1 3 4
Explanation: 
After reversing the given elements of the queue , the resultant queue will be 6 2 10 1 3 4.
Example 2:

Input:
4
4 3 2 1 
Output: 
1 2 3 4
Explanation: 
After reversing the given elements of the queue , the resultant queue will be 1 2 3 4.
*/
