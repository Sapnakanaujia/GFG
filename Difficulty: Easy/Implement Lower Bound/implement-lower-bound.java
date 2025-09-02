class Solution {
    int lowerBound(int[] arr, int target) {
      int lo=0;
      int n=arr.length;
      int hi=n-1;
      int lb=n;
      while(lo<=hi){
          int mid=(hi-lo)/2+lo;
          if(arr[mid]>=target) {
              lb=Math.min(lb,mid);
              hi=mid-1;
          }
          else{
              lo=mid+1;
          }
      }
        return lb;
    }
}
