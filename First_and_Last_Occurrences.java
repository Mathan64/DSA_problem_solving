 ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        ArrayList<Integer> list= new ArrayList<Integer>();
        int c =0;
        if(arr[0]==x){
            list.add(0);
            c++;
        }
        for(int i=1;i<n-1;i++){
            if(arr[i]==x && arr[i-1]!=x){
                list.add(i);
            }
            if(arr[i]==x && arr[i+1]!=x){
                list.add(i);
            }

        }
        if(arr[n-1]==x){
            list.add(n-1);
            c++;
        }
        if(c==1){
            list.add(list.get(0));
        }
        if(list.isEmpty()){
            list.add(-1);
            list.add(-1);
        }
        return list;
    }

/*
Example 1:

Input:
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
Output:  
2 5
Explanation: 
First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5. 
Example 2:

Input:
n=9, x=7
arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
Output:  
6 6
Explanation: 
First and last occurrence of 7 is at index 6.
*/
