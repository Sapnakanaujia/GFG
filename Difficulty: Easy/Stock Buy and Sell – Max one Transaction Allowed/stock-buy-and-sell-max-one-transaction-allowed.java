class Solution {
    public int maxProfit(int[] arr) {
        // Code here
        int n= arr.length;
        int max=0;
        int minprice= Integer.MAX_VALUE;
        for(int a:arr){
            if(a<minprice){
                minprice= a;
            }
            int profit= a-minprice;
            if(profit>max){
                max=profit;
            }
        }
        return max;
        
    }
}