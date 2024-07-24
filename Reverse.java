class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        int n=str.length();
        String result="";
        for(int i=n-1;i>=0;i--){
            result=result+str.charAt(i);
        }
        return result;
    }
}
