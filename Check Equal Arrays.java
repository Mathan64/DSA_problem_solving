class Solution {
    // Function to check if two arrays are equal or not.
    public static boolean check(int[] arr1, int[] arr2) {
        // Your code here
        int n1=arr1.length;
        int n2 =arr2.length;
        if(n1!=n2){
            return false;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n1;i++){
            set.add(arr1[i]);
        }
         for(int i=0;i<n2;i++){
            if(!set.contains(arr2[i]))
            return false;
        }
        return true;
    }
}

/*
Examples:

Input: arr1[] = [1, 2, 5, 4, 0], arr2[] = [2, 4, 5, 0, 1]
Output: true
Explanation: Both the array can be rearranged to [0,1,2,4,5]
Input: arr1[] = [1, 2, 5], arr2[] = [2, 4, 15]
Output: false
Explanation: arr1[] and arr2[] have only one common value.
*/
