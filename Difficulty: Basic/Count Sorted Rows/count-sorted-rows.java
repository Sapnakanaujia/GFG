class Solution {
    int sortedCount(int n, int m, int mat[][]) {
        n = mat.length;
        m = mat[0].length;

        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean inc = true;
            boolean dec = true;

            for (int j = 1; j < m; j++) {
                
                if (mat[i][j] <= mat[i][j - 1]) {
                    inc = false;
                }
                
                if (mat[i][j] >= mat[i][j - 1]) {
                    dec = false;
                }
            }

            if (inc || dec) {
                count++;
            }
        }

        return count;
    }
}