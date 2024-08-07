    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
        ArrayList<Integer>list = new ArrayList<>();
        int ind =0;
        for(int i=0;i<arr1.length;i++){
             list.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
             list.add(arr2[i]);
          }
        Collections.sort(list);
        return list.get(k-1);
    }
/*test cases
  Examples :
Input: n = 2
Output: 1 
Explanation: 1 is the 2nd number of fibonacci series.
Input: n = 5
Output: 5
Explanation: 5 is the 5th number of fibonacci series.
  */
  
