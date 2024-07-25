
class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
{
      Map<Integer, Integer> mp = new HashMap<>();
       for(int i=0;i<N;i++){
           if(mp.containsKey(arr[i])){
               mp.put(arr[i],mp.get(arr[i])+1);
           }
           else{
               mp.put(arr[i],1);
           }
       }
       for(int i=1;i<=N;i++){
           if(mp.containsKey(i)){
           arr[i-1]=mp.get(i);
           }
           else{
               arr[i-1]=0;
           }
       }
    }
}
