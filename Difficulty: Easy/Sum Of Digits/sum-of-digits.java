class Solution {
    static int sumOfDigits(int n) {
        int rev=0;
        int sum=0;
        while(n!=0){
            int digit= n%10;
            sum+=digit;
            rev= rev*10+digit;
            
            n/=10;
        }
        return sum;
    }
}
