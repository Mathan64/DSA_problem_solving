class Solution {
    static int sumd(int[] a,int d,int n){
        int sum =0;
        for(int i=0;i<n;i++){
             sum += Math.ceil((double)a[i]/(double)d);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
         int n = nums.length;
         if(n>threshold) return -1;
         int high = Integer.MIN_VALUE;
         for(int i=0;i<nums.length;i++){
            high = Math.max(nums[i],high);
         }
         int low=0;
         int res=0;
         while(low<=high){
            int mid = (low+high)/2;
            if(sumd(nums,mid,n)<=threshold){
                high = mid-1;
                res=mid;
            }
            else{
                low = mid+1;
            }
         }
         return res;
    }
}

/*
Example 1:

Input: nums = [1,2,5,9], threshold = 6
Output: 5
Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1. 
If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2). 
Example 2:

Input: nums = [44,22,33,11,1], threshold = 5
Output: 44
*/
