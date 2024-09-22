class Solution {
    public List<String> find_permutation(String s) {
        // Code here
          StringBuilder sb = new StringBuilder(s);
          Set<String> hs = new HashSet<>();
          solve(sb,hs,0);
          List<String> ans = new ArrayList<>(hs);
          Collections.sort(ans);
         return ans;
    }
    void solve(StringBuilder sb,Set<String> hs,int index){
         if(index == sb.length()){
         hs.add(sb.toString());
         return;
        }
      for(int i=index; i<sb.length(); i++){
           swap(sb,index,i);
           solve(sb,hs,index+1);
           swap(sb,index,i);
           }
      }
    void swap(StringBuilder sb, int x, int y){
     char ch1 = sb.charAt(x);
     char ch2 = sb.charAt(y);
     sb.setCharAt(x,ch2);
     sb.setCharAt(y,ch1);
    }
}

/*
Example 1:

Input: ABC
Output:
ABC ACB BAC BCA CAB CBA
Explanation:
Given string ABC has permutations in 6 
forms as ABC, ACB, BAC, BCA, CAB and CBA .
Example 2:

Input: ABSG
Output:
ABGS ABSG AGBS AGSB ASBG ASGB BAGS 
BASG BGAS BGSA BSAG BSGA GABS GASB 
GBAS GBSA GSAB GSBA SABG SAGB SBAG 
SBGA SGAB SGBA
Explanation:
Given string ABSG has 24 permutations.
*/
