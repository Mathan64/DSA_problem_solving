class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
         Queue<Integer> q =new PriorityQueue<>();
         for(int i=0;i<arr.length;i++){
             if(arr[i]>=0)
             q.add(arr[i]);
         }
         for(int i=0;i<k-1;i++){
             q.poll();
         }
         return q.peek();
    }
}

/*
Examples :

Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
Output:  7
Explanation: 3rd smallest element in the given array is 7.
Input: arr[] = [7, 10, 4, 20, 15], k = 4 
Output:  15
Explanation: 4th smallest element in the given array is 15.
*/
