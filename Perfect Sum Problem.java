class Solution{
 
public int perfectSum(int arr[],int n, int sum) 
{ 
    // Your code goes here
    int[] dp = new int[sum + 1];
    
    dp[0] = 1;
    
    int mod = 1000000007;
    
    for(int currnum : arr){
        for(int i=sum;i>= currnum;i--){
            dp[i] = (dp[i] + dp[i - currnum]) % mod;
        }
    }
    
    return dp[sum];
    
} 
}

/*
Examples:

Input: 
n = 6, arr = [5, 2, 3, 10, 6, 8], sum = 10
Output: 
3
Explanation: 
{5, 2, 3}, {2, 8}, {10} are possible subsets.
Input: 
n = 5, arr = [2, 5, 1, 4, 3], sum = 10
Output: 
3
Explanation: 
{2, 1, 4, 3}, {5, 1, 4}, {2, 5, 3} are possible subsets.
*/
