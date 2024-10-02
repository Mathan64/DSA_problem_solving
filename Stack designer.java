public static Stack<Integer>_push(ArrayList<Integer> arr,int n)
{
    //Your code here
    Stack<Integer> s = new Stack<>();
    for(int i=0;i<n;i++){
        s.push(arr.get(i));
    }
    return s;
}

public static void _pop(Stack<Integer>s)
{
    //Your code here
    while(!s.empty()){
        System.out.print(s.pop()+" ");
    }
}

/*
Example 1:

Input:
n = 5
arr = {1 2 3 4 5}
Output:
5 4 3 2 1
Example 2: 

Input: 
n = 7
arr = {1 6 43 1 2 0 5}
Output: 
5 0 2 1 43 6 1
*/
