    static boolean ispar(String x)
    {
        // add your code here
        Stack <Character> st=new Stack<>();
        char[] p =x.toCharArray();
        for(char k:p){
            if(k=='{'||k=='('||k=='['){
                st.push(k);
            }
            else{
                if((k==')'&&!st.isEmpty()&& st.peek()=='(')||(k=='}'&&!st.isEmpty()&& st.peek()=='{')||(k==']'&&!st.isEmpty()&& st.peek()=='[')){
                    st.pop();
                }
            else{
                return false;
            }
            }
    } 
    return st.isEmpty();
}
