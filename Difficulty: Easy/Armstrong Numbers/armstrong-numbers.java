// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int dup=n;
        int rev=0;
        int cnt=0;
        while(n>0){
            int ld=n%10;
            cnt++;
            n/=10;
        }
         n = dup;
         int sum=0;
        while(n>0){
            int ld=n%10;
            sum+=(int)Math.pow(ld,cnt);
            n/=10;
        }
         return sum == dup;
    }
}