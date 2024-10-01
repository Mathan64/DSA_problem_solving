class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // Your Code
        arr[top+1]=x;
        top++;
    }

    public int pop() {
        // Your Code
        if(top==-1){
            return -1;
        }
        int n=arr[top];
        arr[top]=0;
        top--;
        return n;
    }
}
/*
Examples :

Input: 1 2 1 3 2 1 4 2 
Output: 3, 4
Explanation: 
push(2)    the stack will be {2}
push(3)    the stack will be {2 3}
pop()      poped element will be 3,
           the stack will be {2}
push(4)    the stack will be {2 4}
pop()      poped element will be 4
Input: 2 1 4 1 5 2
Output: -1, 5
*/
