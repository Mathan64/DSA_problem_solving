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

Input: k = 5, arr1[] = [2, 3, 6, 7, 9], arr2[] = [1, 4, 8, 10]
Output: 6
Explanation: The final combined sorted array would be - 1, 2, 3, 4, 6, 7, 8, 9, 10. The 5th element of this array is 6.
Input: k = 7, arr1[] = [100, 112, 256, 349, 770], arr2[] = [72, 86, 113, 119, 265, 445, 892]
Output: 256
Explanation: Combined sorted array is - 72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892. 7th element of this array is 256.
  */
  
