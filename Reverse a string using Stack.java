class Solution {
    
    public String reverse(String S){
        //code here
        String s="";
      Stack<Character> al=new Stack<>();
      for(int i=0;i<S.length();i++)
      {
          al.push(S.charAt(i));
      }
      while(!al.isEmpty())
      {
          char a=al.pop();
          s=s+a;
      }
      return s;
    }

}
/*
Example 1:


Input: S="GeeksforGeeks"
Output: skeeGrofskeeG
*/
