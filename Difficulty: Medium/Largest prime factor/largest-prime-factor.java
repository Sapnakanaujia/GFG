// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        int ans=2;
        while(n%2==0){
            n=n/2;
        }
        for(int i=3;i<=n;i++){
            while(n%i==0){
                n=n/i;
                ans =i;
            }
        }
        return ans;
    }
}