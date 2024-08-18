//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(St[0]);
            int K = Integer.parseInt(St[1]);
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.splitArray(arr,N,K));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int splitArray(int[] arr , int N, int K) {
              if(N == 1){
                return arr[0];
            }
        // code here
        int low =Integer.MIN_VALUE;
        int high=0;
        int mid=0;
        for(int i=0;i<N;i++){
            if(low<arr[i])
                 low=arr[i];
            high+=arr[i];
        }
            while(low<=high){
                mid =low+ (high-low)/2;
                if(count(arr,N,mid)>=K){
                    low =mid+1;
                }else{
                    high =mid-1;
                }
            }
            return low;
    }
            static int count(int[] arr,int N,int mid){
          int sum=0;
          int count =0;
          for(int i=0;i<N;i++){
              if(sum+arr[i]<=mid){
                  sum+=arr[i];
              }else{
                  count++;
                  sum=arr[i];
              }
          }
          return count;
      }

};

/*
Example 1:

Input:
N = 4, K = 3
arr[] = {1, 2, 3, 4}
Output: 4
Explanation:
Optimal Split is {1, 2}, {3}, {4}.
Maximum sum of all subarrays is 4,
which is minimum possible for 3 splits. 
Example 2:

Input:
N = 3, K = 2
A[] = {1, 1, 2}
Output:
2
Explanation:
Splitting the array as {1,1} and {2} is optimal.
This results in a maximum sum subarray of 2.
*/
