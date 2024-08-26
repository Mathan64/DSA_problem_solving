class Solution {

       static boolean kSmaller(int n, int m, int mid, int k) {
        int c = 0;
        int num = mid/m;
        c+=m*num;
        for(int i=num;i<n;i++){
            c+=mid/(i+1);
        }
        return c >= k;
    }
    public int findKthNumber(int m, int n, int k) {
                  int low = 0, high = m*n, mid, res;
        
        while (low < high) {
            mid = low + (high - low) / 2;    
            if (kSmaller(n, m, mid, k)) high = mid;
            else low = mid + 1;
        }
        
        return low;
        
    }
}

/*
Example 1:
Input: m = 3, n = 3, k = 5
Output: 3
Explanation: The 5th smallest number is 3.

Example 2:
Input: m = 2, n = 3, k = 6
Output: 6
Explanation: The 6th smallest number is 6.
 
*/
