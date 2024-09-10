class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        if(str1.length() != str2.length())
            return false;
        HashMap<Character,Character> hm=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            if(hm.containsKey(str1.charAt(i))){
                if(hm.get(str1.charAt(i)) != str2.charAt(i)){
                    return false;
                }
            }else{
                for(char c:hm.keySet()){
                    if(hm.get(c)==str2.charAt(i) && c!=str1.charAt(i)){
                        return false;
                    }
                }
                hm.put(str1.charAt(i),str2.charAt(i));
            }
        }
     return true;   
        
    }
}

/*
Example 1:

Input:
str1 = aab
str2 = xxy
Output: 
1
Explanation: 
There are two different characters in aab and xxy, i.e a and b with frequency 2 and 1 respectively.
Example 2:

Input:
str1 = aab
str2 = xyz
Output: 
0
Explanation: 
There are two different characters in aab but there are three different charactersin xyz. So there won't be one to one mapping between str1 and str2.
*/
