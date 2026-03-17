// User function Template for Java

class Solution {
    public void Addition(int[][] A, int[][] B) {
        // code here
        int m=A.length;
        int n= A[0].length;
        // int c[][]= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                A[i][j] = A[i][j]+B[i][j];
                
            }
        }
        
    }
}