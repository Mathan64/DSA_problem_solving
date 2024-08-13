class Solution {
    public int[] findMaxRow(int mat[][], int N) {
        // code here
        int r=0;
        int c=0;
        int i =0;
        int j= N-1;
        while(j>=0 && i<N)
        {
         if(mat[i][j]==1){
             c++;
             r=i;
             j--;
             
         }else{
             i++;
         }   
        }
        int[] a = {r,c};
        return a;
    }
};
/*
Example 1

Input:
N=3
mat[3][3] = {0, 0, 1, 
              0, 1, 1, 
              0, 0, 0}
Output:
Row number = 1
MaxCount = 2
Explanation:
Here, max number of 1s is in row number 1
and its count is 2.
Example 2

Input:
N=3
mat[3][3] = {1, 1, 1, 
              1, 1, 1, 
              0, 0, 0}
Output:
Row number = 0
MaxCount = 3
*/
