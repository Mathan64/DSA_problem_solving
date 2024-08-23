class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {

         // Your code here
        String rotated=s1+s1;
        int cnt=0;
        int j=0;
        for(int i=0;i<rotated.length();i++){
            if(j==s2.length())break;
            if(rotated.charAt(i)==s2.charAt(j)){
            cnt++;
            j++;}
        }
        if(cnt==s2.length())return true;
        return false;
    }
    
}
