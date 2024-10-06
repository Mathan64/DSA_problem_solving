class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int result =0;
        int n = str.length();
        
        for(int i=0;i<n;i++){
            int current = map.get(str.charAt(i));
            if(i<n-1 && current<map.get(str.charAt(i+1))){
                result -=current;
            }else{
                result +=current;
            }
        }
        return result;
    }
}

/*
Example 1:

Input:
s = V
Output: 5
Example 2:

Input:
s = III 
Output: 3
*/
