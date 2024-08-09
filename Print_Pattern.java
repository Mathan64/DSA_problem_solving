class Solution{
    public int decrease(int n, int breakpoint, ArrayList<Integer> res){
        if(n <= breakpoint)return n;
        res.add(n);
        return decrease(n-5,breakpoint,res);
    }
    public void increase(int n, int breakpoint, ArrayList<Integer>res){
        if(n > breakpoint)return;
        res.add(n);
        increase(n+5,breakpoint,res);
    }
    public List<Integer> pattern(int N){
        //code here
        ArrayList<Integer> res = new ArrayList<>();
        int v = decrease(N,0,res);
        increase(v,N,res);
        return res;
    }
}

/*
Examples
Input: n = 16
Output: 16 11 6 1 -4 1 6 11 16
Explanation: The value decreases until it is greater than 0. After that it increases and stops when it becomes 16 again.
Input: n = 10
Output: 10 5 0 5 10
Explanation: It follows the same logic as per the above example.
*/
