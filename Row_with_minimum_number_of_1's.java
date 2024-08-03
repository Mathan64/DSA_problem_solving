    int minRow(int n, int m, int a[][]) {
        // code here
       int t=0;
      int t2=Integer.MAX_VALUE;
      int t3=1;
        for(int i =0;i<n;i++){
            t=0;
            for(int j=0;j<m;j++){
               t+=a[i][j]; 
            }
            if(t2>t){
                t2=t;
                t3=i+1;
            }
        }
       return t3;
    }
