// User function Template for Java

class Solution {
    static int fact(int n){
        if(n==0 || n==1) return 1;
        return n*fact(n-1);
    }
    static int isStrong(int n) {
        // code here
        int t=n;
        int sum=0;
        int rev=0;
        while(t>0){
            int digit=t%10;
            sum+=fact(digit);
            // rev= rev*10+digit;
            t/=10;

        }
    if(sum==n) return 1;
    return 0;
    
    }
};