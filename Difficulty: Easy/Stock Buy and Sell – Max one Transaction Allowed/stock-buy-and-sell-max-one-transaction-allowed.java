// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        int n =prices.length;
        int min=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int ele: prices){
            if(ele<min){
                min=ele;
            }
            else if(ele-min>maxProfit){
                maxProfit=ele-min;
            }
        }
        return maxProfit;
        
    }
}