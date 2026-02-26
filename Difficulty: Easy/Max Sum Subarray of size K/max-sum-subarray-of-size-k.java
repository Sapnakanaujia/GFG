class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int ans=0;
        int n= arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            // 0 to k-1
            
            if(i>=k){
                sum-=arr[i-k];
            }
            if(i>=k-1){
                ans= Math.max(ans,sum);
            }
            
        }
        return ans;
        
    }
}