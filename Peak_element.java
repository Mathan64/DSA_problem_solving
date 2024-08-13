class Solution
{
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       int max = Integer.MIN_VALUE;
       int ind =0;
       for(int i=0;i<n;i++){
           if(max<arr[i]){
             max = arr[i];
             ind =i;
           }
       }
       return ind;
    }
}

/*
Input: n = 3, arr[] = {1, 2, 3} 
Output: 1
Explanation: If the index returned is 2, then the output printed will be 1. Since arr[2] = 3 is greater than its adjacent elements, and there is no element after it, we can consider it as a peak element. No other index satisfies the same property, so answer will be printed as 0.
Input: n = 7, arr[] = {1, 1, 1, 2, 1, 1, 1}
Output: 1
Explanation: In this case there are 5 peak elements with indices as {0,1,3,5,6}. Returning any of them will give you correct answer.
*/
