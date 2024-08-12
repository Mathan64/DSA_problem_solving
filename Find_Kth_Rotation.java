class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int min = Integer.MAX_VALUE;
        int k=-1;
        for(int i= 0;i<arr.size();i++){
            if(min>arr.get(i)){
                min=arr.get(i);
                k=i;
            }
        }
        return k;
    }
}

/*
Examples:

Input: arr = [5, 1, 2, 3, 4]
Output: 1
Explanation: The given array is 5 1 2 3 4. The original sorted array is 1 2 3 4 5. We can see that the array was rotated 1 times to the right.
Input: arr = [1, 2, 3, 4, 5]
Output: 0
Explanation: The given array is not rotated
*/
