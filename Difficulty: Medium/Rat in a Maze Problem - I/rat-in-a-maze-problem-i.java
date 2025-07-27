class Solution {
    public static void solveMaze(ArrayList<String> ans, int r, int c, int[][] m, int n, String p,boolean[][] vis){
        if(r==n-1 && c== n-1 && m[r][c]!=0){
            ans.add(p);
            return;
        }
        if(r>=0 && r<n && c>=0 && c<n){
            if(vis[r][c]==true || m[r][c]==0) return;
            vis[r][c]=true;
            solveMaze(ans,r+1,c,m,n,p+'D',vis);
            solveMaze(ans,r,c-1,m,n,p+'L',vis);
            solveMaze(ans,r,c+1,m,n,p+'R',vis);
            solveMaze(ans,r-1,c,m,n,p+'U',vis);
            vis[r][c]=false;
        }
    }
    // Function to find all possible paths
    public ArrayList<String> ratInMaze(int[][] m) {
        // code here
        int n= m.length;
        ArrayList<String> ans= new ArrayList<>();  
        boolean[][] vis= new boolean[n][n];
        solveMaze(ans,0,0,m,n,"",vis);
        return ans;
    }
}