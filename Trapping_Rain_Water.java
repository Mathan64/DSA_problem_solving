
class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int left = 0, right = n - 1;
        long res = 0;
        int maxleft = 0, maxright = 0;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] >= maxleft) {
                    maxleft = arr[left];
                } else {
                    res += maxleft - arr[left];
                }
                left++;
            } else {
                if (arr[right] >= maxright) {
                    maxright = arr[right];
                } else {
                    res += maxright - arr[right];
                }
                right--;
            }
        }
        return res;
    } 
}
