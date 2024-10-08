class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] a = new int[nums.length*2];
        int ind1=0;
        for(int i =0;i<nums.length;i++){
            a[ind1++]=nums[i];
            a[ind1+(nums.length-1)]=nums[i];
        }
        return a;
    }
}

/*
Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
*/
