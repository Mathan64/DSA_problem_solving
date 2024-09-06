class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int low = 0, high = x, result = 0;
        
        while (low <= high) {
            int mid = (low + high)/ 2;
            long midSquared = (long) mid * mid;

            if (midSquared == x) {
                return mid;
            } else if (midSquared < x) {
                low = mid + 1;
                result = mid;  // Keep track of the floor of sqrt(x)
            } else {
                high = mid - 1;
            }
        }
        
        return result;
    }
}

/*
Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 
*/
