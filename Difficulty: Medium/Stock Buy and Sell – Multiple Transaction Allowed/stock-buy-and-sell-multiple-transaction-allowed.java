// User function Template for Java
class Solution {
    public int maximumProfit(int prices[]) {
        int n= prices.length;
        int max=0;
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1])
                max+=prices[i]-prices[i-1];
        }
        return max;
    }
}