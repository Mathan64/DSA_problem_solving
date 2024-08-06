    public int[] matrixDiagonally(int[][] arr) {
        
        int n = arr.length;
    int[] res = new int[n * n];
    int p = 0;

    int i = 0, j = 0;

    while (i < n && j < n) {
        while (i >= 0 && j < n) {
            res[p++] = arr[i--][j++];
        }
        
        if (i < 0 && j < n) {
            i = 0;
        } else if (j == n) {
            i += 2;
            j--;
        }
        
        while (i < n && j >= 0) {
            res[p++] = arr[i++][j--];
        }
        
        
        if (j < 0 && i < n) {
            j = 0;
        } else if (i == n) {
            j += 2;
            i--;
        }
    }

    return res;
        
    }
