class Solution {
    boolean hasArrayTwoCandidates(int arr[], int x) {
        // code here
        Arrays.sort(arr);
        int low=0,high=arr.length-1;
        while(low<high){
            int sum=arr[low]+arr[high];
            if(sum==x) return true;
            if(sum<x) low++;
            else high--;
        }
        return false;
    }
}
/*Examples:

Input: x = 16, arr[] = [1, 4, 45, 6, 10, 8]
Output: true
Explanation: arr[3] + arr[4] = 6 + 10 = 16
Input: x = 11, arr[] = [1, 2, 4, 3, 6]
Output: false
Explanation: None of the pair makes a sum of 11
  */
