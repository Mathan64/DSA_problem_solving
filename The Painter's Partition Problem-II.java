 class Solution{
    
        //code here
          static long count(int arr[], long mid, int n) {
        int count=0,sum=0;
        for(int i=0;i<n;i++) {
            if(sum + arr[i] <= mid)
            sum += arr[i];
            else {
                count++;
                sum = arr[i];
            }
        }
        return count;
    }
    static long minTime(int[] arr,int n,int m){
         long low=Integer.MIN_VALUE;
         long high=0;
         for(int i=0;i<n;i++){
             if(low<arr[i])
                 low = arr[i];
              high+=arr[i];   
         }
        while(low<=high) {
             long mid = low + (high-low)/2;
            if(count(arr,mid,n) >= m) low = mid+1;
            else high = mid-1;
        }
        return low;
    }
    }

/*
Example 1:

Input:
n = 5
k = 3
arr[] = {5,10,30,20,15}
Output: 35
Explanation: The most optimal way will be:
Painter 1 allocation : {5,10}
Painter 2 allocation : {30}
Painter 3 allocation : {20,15}
Job will be done when all painters finish
i.e. at time = max(5+10, 30, 20+15) = 35
Example 2:

Input:
n = 4
k = 2
arr[] = {10,20,30,40}
Output: 60
Explanation: The most optimal way to paint:
Painter 1 allocation : {10,20,30}
Painter 2 allocation : {40}
Job will be complete at time = 60

*/
