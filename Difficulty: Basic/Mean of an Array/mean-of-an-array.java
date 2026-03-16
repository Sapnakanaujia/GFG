// User function Template for Java

class Solution {
    public static int findMean(int[] arr) {
        // code here
        int sum=0;
        for(int n:arr){
            sum+=n;
        }
        int avg= sum/arr.length;
        return avg;
        
    }
};