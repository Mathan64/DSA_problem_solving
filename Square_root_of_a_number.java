class Solution {
    long floorSqrt(long n) {
        // Your code here
        int c =0 ;
        for(int i =1 ; i*i<=n;i++){
            c++;
        }
        return c;
    }
}

/*
Examples:

Input: n = 5
Output: 2
Explanation: Since, 5 is not a perfect square, floor of square_root of 5 is 2.
Input: n = 4
Output: 2
Explanation: Since, 4 is a perfect square, so its square root is 2.
*/
