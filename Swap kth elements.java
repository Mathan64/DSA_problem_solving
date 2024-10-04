class Solution {
    public void swapKth(int k, List<Integer> arr) {
        // code here
        int n = arr.size();
        int temp =arr.get(k-1); 
        arr.set(k-1,arr.get(n-k));
        arr.set(n-k,temp);
    }
}
/*
Examples :

Input: k = 3, arr = [1, 2, 3, 4, 5, 6, 7, 8]
Output: [1, 2, 6, 4, 5, 3, 7, 8]
Explanation: 3rd element from beginning is 3 and 3rd element from end is 6, so we replace 3 & 6.
Input: k = 2, arr = [5, 3, 6, 1, 2]
Output: [5, 1, 6, 3, 2]
Explanation: 2nd element from beginning is 3 and from end is 1.
*/
