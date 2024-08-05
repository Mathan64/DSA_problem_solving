   int[][] rotateMatrix(int k, int a[][]) {
        // code here
        int m=a.length;
        int n=a[0].length;
        if (k==n){
            return a;
        }
        else{
        for(int i=0;i<m;i++){
          rotate(a[i],k);
        
    }
            return a;
        }
}
    public static void rotate(int a[], int k){
        for(int l=0;l<k;l++){
            int f=a[0];
        for(int i=1;i<a.length;i++){
            a[i-1]=a[i];
        }
            a[a.length-1]=f;
        }
    }
