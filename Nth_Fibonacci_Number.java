    static int nthFibonacci(int n){
        // code here
       
        if(n==1 || n==2)return 1 ;
        int a =1;
        int b =1;
        int c = 1;
        for (int i = 3; i <=n; i++) {
            a=b;
            b=c;
            c=(c+a)%1000000007;
        }
        return c;
    }
/*
Examples :

Input: n = 2
Output: 1 
Explanation: 1 is the 2nd number of fibonacci series.
Input: n = 5
Output: 5
Explanation: 5 is the 5th number of fibonacci series.
*/
