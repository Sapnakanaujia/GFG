// User function Template for Java

class Solution {
    static int solve(int bt[]) {
        Arrays.sort(bt);
        // code here
        int n= bt.length;
        int t=0;
        int wt=0;
        for(int i=0;i<n;i++){
            wt+=t;
            t+=bt[i];
        }
        return wt/n;
    }
}
