class Solution {
      static int maxi(int[] a){
        int max = Integer.MIN_VALUE;
        int n=a.length;
        for(int i=0;i<n;i++){
             max =Math.max(max,a[i]);
        }
        return max;
      }
      static int  minhour(int[] piles,int mid){
            int hour=0;
            int n=piles.length;
            for(int i=0;i<n;i++){
                hour+=Math.ceil((double)piles[i]/(double)mid);
            }
            return hour;
      }
    public int minEatingSpeed(int[] piles, int h) {
          int i =1;
          int j =maxi(piles);
         
          while(i<=j){
              int mid = i+(j-i)/2;
              int t=minhour(piles,mid);
              if(t<=h){
                 System.out.println(mid);
                   j=mid-1;
              }else{
                   i=mid+1;
              }
          }
          return i;
    }
}

/*
Example 1:

Input: piles = [3,6,7,11], h = 8
Output: 4
Example 2:

Input: piles = [30,11,23,4,20], h = 5
Output: 30
Example 3:

Input: piles = [30,11,23,4,20], h = 6
Output: 23
*/
