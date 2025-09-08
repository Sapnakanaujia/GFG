class Solution {
    int smallestDivisor(int[] arr, int t) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(arr[i],max);
        }
        int d=0;
        
        int lo=1;
        int hi=max;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int sum=0;
            for(int i=0;i<n;i++){
                if(arr[i]%mid==0){
                    sum+=arr[i]/mid;
                }else{
                    sum+=arr[i]/mid+1;
                }
            }
            if(sum<=t){
                d=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return d;
    }
}