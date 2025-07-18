class Solution {
    public int getSecondLargest(int[] arr) {
        int n= arr.length;
        int fmax=0;
        int smax=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>fmax)
                fmax=arr[i];
        }
        for(int i=0;i<n;i++){
            if(arr[i]>smax && arr[i]!=fmax){
                smax=arr[i];
            }
        }
        return smax;
    }
}