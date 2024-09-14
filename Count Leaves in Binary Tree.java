class Tree
{
    int countLeaves(Node node) 
    {
         // Your code  
         int count=0;
         if(node==null){
             return 0;
         }
         if(node.left==null && node.right==null){
             return 1;
         }
         count=countLeaves(node.left)+countLeaves(node.right);
        return count; 
    }
}
/*
Input:
Given Tree is 
               4
             /   \
            8     10
           /     /   \
          7     5     1
         /
        3 
Output:
3
Explanation: 
Three leaves are 3 , 5 and 1.
*/
