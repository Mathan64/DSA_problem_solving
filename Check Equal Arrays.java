class Solution {
    // Function to check if two arrays are equal or not.
    public static boolean check(int[] arr1, int[] arr2) {
        // Your code here
       if (arr1.length != arr2.length) {
            return false;
        }
       int sum1=0;
       int sum2=0;
       
       for(int i=0;i<arr1.length;i++){
           sum1=sum1+arr1[i];
           sum2=sum2+arr2[i];
       }
       if(sum1==sum2){
           return true;
       }
        return false;  
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
