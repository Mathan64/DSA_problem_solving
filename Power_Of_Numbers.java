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
