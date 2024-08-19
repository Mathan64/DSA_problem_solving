
class Solution {
    
    static int count(int[] arr,int n,int mid){
        int c=0;
        int sum=0;
        for(int i=0;i<n;i++){
           if(sum+arr[i]<=mid){
               sum+=arr[i];
           }else{
               c++;
               sum=arr[i];
           }   
        }
        return c;
    }
    
    static int leastWeightCapacity(int[] arr, int n, int d) {
        // code here
        if(n==1)
            return arr[0];
      int low=Integer.MIN_VALUE;
      int high=0;
      for(int i=0;i<n;i++){
          if(low<arr[i])
              low=arr[i];
          high+=arr[i];
      }
      while(low<=high){
          int mid =low+(high-low)/2;
          if(count(arr,n,mid)>=d){
              low=mid+1;
          }else{
              high=mid-1;
          }
      }
      return low;
    }    
};

/*
Example 1:

Input:
n = 3
arr[] = {1, 2, 1}
d = 2
Output:
3
Explanation:
We can ship the weights in 2 days
in the following way:-
Day 1- 1,2
Day 2- 1
Example 2:
Input:
n = 3
arr[] = {9, 8, 10}
d = 3
Output:
10
Explanation:
We can ship the weights in 3 days
in the following way:-
Day 1- 9
Day 2- 8
Day 3- 10
*/
