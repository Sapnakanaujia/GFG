class Solution {
    public int maxWater(int arr[]) {
         int n=arr.length;
        int l=0, r=n-1;
        int max=0;
        while(l<r){
            int h= Math.min(arr[l],arr[r]);
            int w= r-l;
            int area= h*w;
            max= Math.max(area,max);
            if(arr[l]<arr[r]) l++;
            else r--;
        }
        return max;
    }
}