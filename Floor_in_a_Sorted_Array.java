class Solution {
    static int findFloor(long arr[], int n, long x) {
        int min = -1;
       for(int i =0;i<n;i++){
           if(arr[i]<=x){
              min =i;
           }
       }
           return min;
    }
}
/*
Examples

Input: n = 7, x = 0 arr[] = {1,2,8,10,11,12,19}
Output: -1
Explanation: No element less than 0 is found. So output is "-1".

Input: n = 7, x = 5 arr[] = {1,2,8,10,11,12,19}
Output: 1
Explanation: Largest Number less than 5 is 2 (i.e k = 2), whose index is 1(0-based indexing).
*/
