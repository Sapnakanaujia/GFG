class Solution {
    public boolean search(int[] arr, int k) {
        // code here
        int n= arr.length;
        int l=0, r=n-1;
        
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==k) return true;
            if(arr[l]==arr[mid] && arr[mid]==arr[r]){
                l++;
                r--;
            }
            else if(arr[l]<=arr[mid]){
                if(arr[l]<=k && k<arr[mid]) r=mid-1;
                else l=mid+1;
            }
            else{
                if(arr[mid]<k && k<=arr[r]) l=mid+1;
                else r= mid-1;
            }
        }
        return false;
    }
}
