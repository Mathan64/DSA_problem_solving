static void rotateby90(int mat[][], int n) 
    { 
        // reverse
         for (int i = 0; i <n; i++) {
            for (int j = 0; j <(n/2); j++) {
                int temp = mat[i][n-1-j];
                mat[i][n-1-j] = mat[i][j];
                mat[i][j] = temp;
            }
        }

 

       // transpose

        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {

                if(i!=j && i<j){
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
        }
    }
