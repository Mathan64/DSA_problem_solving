class Solution
{
    public int countWords(String list[], int n)
    {
        // code here 
        HashMap<String,Integer> map = new HashMap<>();
       
        for(int i=0; i<n;i++){
            map.put(list[i],map.getOrDefault(list[i],0)+1);
        }
        int count = 0;
        for(String key:map.keySet()){
            
            if(map.get(key) == 2){
                count++;
            }
        }
        return count;
    }
}

/*
Example 1:

Input:
N = 3
list = {Geeks, For, Geeks}
Output: 1
Explanation: 'Geeks' is the only word that 
appears twice. 
Example 2:

Input:
N = 8
list = {Tom, Jerry, Thomas, Tom, Jerry, 
Courage, Tom, Courage}
Output: 2
Explanation: 'Jerry' and 'Courage' are the 
only words that appears twice. 
*/
