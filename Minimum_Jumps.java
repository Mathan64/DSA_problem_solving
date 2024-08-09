class Solution {
    static int minJumps(int[] arr, int n) {
        //code here
        if (n <= 1) return 0; 
        if (arr[0] == 0) return -1;

        int maxReach = arr[0];  
        int step = arr[0];      
        int jump = 1;           

        for (int i = 1; i < n; i++) {
    
            if (i == n - 1) return jump;
            maxReach = Math.max(maxReach, i + arr[i]);
            step--;
            if (step == 0) {
                jump++;
                if (i >= maxReach) return -1;

                step = maxReach - i;
            }
        }
        return -1;
    }
}

/*
Examples : 

Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}, n = 11
Output: 3 
Explanation:First jump from 1st element to 2nd element with value 3. From here we jump to 5th element with value 9, and from here we will jump to the last. 
Input: arr = {1, 4, 3, 2, 6, 7}, n = 6
Output: 2 
Explanation: First we jump from the 1st to 2nd element and then jump to the last element.
Input: arr = {0, 10, 20}, n = 3
Output: -1
Explanation: We cannot go anywhere from the 1st element.
*/
