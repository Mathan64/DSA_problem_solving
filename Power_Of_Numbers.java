class Solution {
    // Function to calculate power of N to the power of R modulo 1000000007
    long power(int N, int R) {
        int MOD = 1000000007;
        long result = 1;
        long base = N;
        
        while (R > 0) {
            // If R is odd, multiply base with the result
            if (R % 2 == 1) {
                result = (result * base) % MOD;
            }
            // Now, R must be even, so divide it by 2 and square the base
            R = R / 2;
            base = (base * base) % MOD;
        }
        return result;
    }
}
/*
Example 1:

Input:
N = 2, R = 2
Output: 4
Explanation: The reverse of 2 is 2 and after raising power of 2 by 2 we get 4 which gives remainder as 4 when divided by 1000000007.
Example 2:

Input:
N = 12, R = 21
Output: 864354781
Explanation: The reverse of 12 is 21and 1221 when divided by 1000000007 gives remainder as 864354781.
*/
