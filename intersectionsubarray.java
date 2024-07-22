class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
       public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
    int commonElements = 0;
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i=0;i<n;i++){
      set.add(a[i]);
    }
    for(int i=0;i<m;i++){
      if(set.contains(b[i])){
        commonElements++;
        set.remove(b[i]);
      }
    }
    return commonElements;
    }
};
