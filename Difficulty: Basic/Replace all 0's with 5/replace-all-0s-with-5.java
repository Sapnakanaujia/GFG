class Solution {
    int convertfive(int t) {
        // Your code here
        int rev=0;
        int n= t;
        if(n==0) return 5;
        while(n>0){
            int digit=n%10;
            
            if(digit==0){
                digit=5;
            }
            rev= rev*10+digit;
            n/=10;
        }
        int Rev=0;
        while(rev>0){
            int digit=rev%10;
            
            if(digit==0){
                digit=5;
            }
            Rev= Rev*10+digit;
            rev/=10;
        }
        
        return Rev;
    }
}