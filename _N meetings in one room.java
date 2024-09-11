class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int n, int start[], int end[]) {
        // add your code here
              int[][] meetings = new int[n][2];
        for (int i = 0; i < n; i++) {
            meetings[i][0] = start[i];
            meetings[i][1] = end[i]; 
        }
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[1]));
        int count = 1;
        int endTime = meetings[0][1]; 
        for (int i = 1; i < n; i++) {
            if (meetings[i][0] > endTime) {
                count++; 
                endTime = meetings[i][1]; 
            }
        }
        return count; 
    }
}
/*
Examples :

Input: n = 6, start[] = [1, 3, 0, 5, 8, 5], end[] =  [2, 4, 6, 7, 9, 9]
Output: 4
Explanation: Maximum four meetings can be held with given start and end timings. The meetings are - (1, 2), (3, 4), (5,7) and (8,9)
Input: n = 3, start[] = [10, 12, 20], end[] = [20, 25, 30]
Output: 1
Explanation: Only one meetings can be held with given start and end timings.
*/
