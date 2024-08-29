class Solution {
    public static int doUnion(int arr1[], int arr2[]) {
        // Your code here
        HashSet<Integer> set=new HashSet<>();
        for(int i =0 ;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        return set.size();
    }
}

/*
Examples

Input: arr1[] = [1, 2, 3, 4, 5], arr2[] = [1, 2, 3]
Output: 5
Explanation: 1, 2, 3, 4 and 5 are the elements which comes in the union setof both arrays. So count is 5.
Input: arr1[] = [85, 25, 1, 32, 54, 6], arr2[] = [85, 2] 
Output: 7
Explanation: 85, 25, 1, 32, 54, 6, and 2 are the elements which comes in the union set of both arrays. So count is 7.
*/
