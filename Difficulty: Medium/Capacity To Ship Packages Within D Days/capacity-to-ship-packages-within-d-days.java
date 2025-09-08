// User function Template for Java

class Solution {
    static int leastWeightCapacity(int[] arr, int n, int d) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            max=Math.max(arr[i],max);
            sum+=arr[i];
        }
        int lo=max;
        int hi=sum;
        int minC=hi;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int load=0;
            int Days=1;
            for(int i=0;i<n;i++){
                if(load+arr[i]<=mid){
                    load+=arr[i];
                }
                else{
                    load=arr[i];
                    Days++;
                }
            }
            if(Days<=d){
                minC=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return minC;
    }
}