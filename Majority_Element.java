class Solution
{
    static int majorityElement(int arr[], int size)
    {
        // your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        boolean flag=true;
        for(int i=0;i<size;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
            if(map.get(arr[i])>size/2){
                return arr[i];
            }
        }
        return -1;
    }
}
