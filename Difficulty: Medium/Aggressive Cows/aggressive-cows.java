class Solution {
    public int aggressiveCows(int[] arr, int k) {
        int start=1;
        int n=arr.length;
        int ans=0;
        int mid=0;
        Arrays.sort(arr);
        int end= arr[n-1]-arr[0];
        while(start<=end){
            mid=start+(end-start)/2;
            int pos=arr[0];
            int count=1;
            for(int i=1;i<n;i++){
                if(pos+mid<=arr[i]){
                    count++;
                    pos=arr[i];
                }
            }
            if(count<k){
                end=mid-1;
            }
            else{
                ans=mid;
                start=mid+1;
                
            }
        }
     return ans;       
    }
}