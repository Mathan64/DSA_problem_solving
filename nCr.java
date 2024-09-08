class Solution{
    static final int mod = 1000000007;
   public static int nCr(int n, int r) {
        if (r > n) {
            return 0;
        }
        int[] prev = new int[r + 1];
        int[] curr = new int[r + 1];
        prev[0] = curr[0] = 1;
        if (r > 0) {
            curr[1] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= r; j++) {
                curr[j] = (prev[j - 1] + prev[j]) % mod;
            }
            // copy curr to prev
           System.arraycopy(curr, 0, prev, 0, r + 1);
        }
        return curr[r];
    }
}

/*
Example 1:

Input: n = 3, r = 2
Output: 3
Explaination: 3C2 = 3. 
Example 2:

Input: n = 2, r = 4
Output: 0
Explaination: r is greater than n.
*/
