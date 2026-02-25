class Solution {
    int maxSubarraySum(int[] arr) {
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        int n= arr.length;
        for(int i=0;i<n;i++){
            sum= sum+arr[i];
            sum= Math.max(sum, arr[i]);
            maxsum= Math.max(sum,maxsum);
        }
        return maxsum;
    }
}
