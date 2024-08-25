class Solution {

    public boolean isValid(String str) {
        // Write your code here
        String arr[] = str.split("\\.");
        
        if(arr.length != 4){
            return false;
        }
        
        for(int i=0;i<arr.length;i++){
            int n = arr[i].length();
            if(n > 3 || n == 0){
                return false;
            }
            
            int num = Integer.parseInt(arr[i]);
            
            if((n == 3 && num < 100) || (n == 2 && num < 10)){
                return false;
            }
            
            if(num >= 0 && num <= 255){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}

/*
Examples :

Input: str = 222.111.111.111
Output: true
Explanation: Here, the IPv4 address is as per the criteria mentioned and also all four decimal numbers lies in the mentioned range.
Input: str = 5555..555
Output: false
Explanation: 5555..555 is not a valid. IPv4 address, as the middle two portions are missing.
*/
