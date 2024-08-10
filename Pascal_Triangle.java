class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Long> ans=new ArrayList<Long>();
        long[][] dp=new long[n][n];
        dp[0][0]=1;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j==0)
                {
                    dp[i][j]=1; continue;
                }
                dp[i][j]=(dp[i-1][j-1]+dp[i-1][j])%1000000007;
            }
        }
        for(int i=0;i<n;i++)
        ans.add(dp[n-1][i]);
        return ans;
    }
}
/*
Example 1:

Input:
N = 4
Output: 
1 3 3 1
Explanation: 
4th row of pascal's triangle is 1 3 3 1.
Example 2:

Input:
N = 5
Output: 
1 4 6 4 1
Explanation: 
5th row of pascal's triangle is 1 4 6 4 1.
*/
