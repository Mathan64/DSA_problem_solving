class Solution {
    public static boolean Possible(int[] arr,int dist,int cows){
        int countcows=1;
        int lastcow=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-lastcow>=dist){
                lastcow=arr[i];
                countcows++;
            }
            if(countcows>=cows) return true;
        }
        return false;
    }
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int low=1;
        int high=stalls[n-1]-stalls[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(Possible(stalls,mid,k)) low=mid+1;
            else high=mid-1;
        }
        return high;
    }
    }
/*

Aggressive Cows
Difficulty: HardAccuracy: 59.57%Submissions: 66K+Points: 8
You are given an array consisting of n integers which denote the position of a stall. You are also given an integer k which denotes the number of aggressive cows. You are given the task of assigning stalls to k cows such that the minimum distance between any two of them is the maximum possible.
The first line of input contains two space-separated integers n and k.
The second line contains n space-separated integers denoting the position of the stalls.

Example 1:

Input:
n=5 
k=3
stalls = [1 2 4 8 9]
Output:
3
Explanation:
The first cow can be placed at stalls[0], 
the second cow can be placed at stalls[2] and 
the third cow can be placed at stalls[3]. 
The minimum distance between cows, in this case, is 3, 
which also is the largest among all possible ways.
Example 2:

Input:
n=5 
k=3
stalls = [10 1 2 7 5]
Output:
4
Explanation:
The first cow can be placed at stalls[0],
the second cow can be placed at stalls[1] and
the third cow can be placed at stalls[4].
The minimum distance between cows, in this case, is 4,
which also is the largest among all possible ways
*/
