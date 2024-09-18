class Solution{
    static int evenlyDivides(int N){
        // code here
        String ab = Integer.toString(N);
        int count = 0;
        int n1 = 0;
        for(int i=0;i<ab.length();i++){
            n1 = (int)ab.charAt(i)-48;
            if(n1 == 0){
                continue;
            }
            else if(N%n1 == 0){
                count ++;
            }
        }
        
        return count;
    }
}
/*Examples :

Input: n = 12
Output: 2
Explanation: 1, 2 when both divide 12 leaves remainder 0.
Input: n = 2446
Output: 1
Explanation: Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do not.
Input: n = 23
Output: 0
Explanation: 2 and 3, none of them divide 23 evenly.*/
