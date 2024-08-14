class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int x =0 ;
        for(int i=0;i<commands.size();i++){
            if(commands.get(i).equals("RIGHT")){
                   x++;
             }
            else if(commands.get(i).equals("LEFT")){
                x--;
            }
            else if(commands.get(i).equals("DOWN")){
                x+=n;
            }else{
                 x-=n;
            }
        }
       return x; 
    }
}

/*
Input: n = 2, commands = ["RIGHT","DOWN"]

Output: 3
*/
