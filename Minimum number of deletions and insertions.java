class Solution
{
	public int minOperations(String str1, String str2) 
	{ 
	    // Your code goes here
	    int[][] dp = new int[str1.length()+1][str2.length()+1];
	    for(int i=1; i<dp.length; i++){
	        for(int j=1; j<dp[0].length; j++){
	            if(str1.charAt(i-1) == str2.charAt(j-1)){
	                dp[i][j] = 1 + dp[i-1][j-1];
	            }else{
	                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
	            }
	        }
	    }
	    int commonLen = dp[str1.length()][str2.length()];
	    return (str1.length()-commonLen) + (str2.length()-commonLen);
	} 
}
/*Examples :

Input: str1 = "heap", str2 = "pea"
Output: 3
Explanation: 2 deletions and 1 insertion.
p and h deleted from heap. Then, p is inserted at the beginning.
One thing to note, though p was required yet it was removed/deleted first from its position and then it is inserted to some other position. Thus, p contributes one to the deletion_count and one to the insertion_count.
Input : str1 = "geeksforgeeks", str2 = "geeks"
Output: 8
Explanation: 8 deletions, i.e. remove all characters of the string "forgeeks".*/
