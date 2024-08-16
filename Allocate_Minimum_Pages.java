class Solution {
    // Function to find minimum number of pages.
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
     public static long findPages(int n, int arr[], int m) {
         if(n<m) return -1;
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
};

/*
Examples:

Input: n = 4, arr[] = [12, 34, 67, 90], m = 2
Output: 113
Explanation: Allocation can be done in following ways:
{12} and {34, 67, 90} Maximum Pages = 191
{12, 34} and {67, 90} Maximum Pages = 157
{12, 34, 67} and {90} Maximum Pages =113.
Therefore, the minimum of these cases is 113, which is selected as the output.
Input: n = 3, arr[] = [15, 17, 20], m = 5
Output: -1
Explanation: Allocation can not be done.
*/
