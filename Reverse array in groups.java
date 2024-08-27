class Solution {

    // Function to reverse every sub-array group of size k.
   void reverseInGroups(ArrayList<Long> arr, int k) {
        int N = arr.size();
        for(int i=0; i<N; i=i+k){
            int low = i;
            int  high = i+k-1;
            if(high>N-1){
                high=N-1;
            }
            while(low<high){
                long temp=arr.get(low);
                arr.set(low, arr.get(high));
                arr.set(high, temp);
                low++;
                high--;
            }
        }
    }
}

/*
Examples:

Input: k = 3, arr= [1, 2, 3, 4, 5]
Output: [3, 2, 1, 5, 4]
Explanation: First group consists of elements 1, 2, 3. Second group consists of 4,5.
Input: k = 5, arr = [5, 6, 8, 9]
Output: [9, 8, 6, 5]
Explnation: Since k is greater than array size, the entire array is reversed.
*/
