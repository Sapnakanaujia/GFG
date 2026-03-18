class Solution {
    int maxProduct(int[] arr) {
        int maxpro=arr[0];
        int minpro=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                int temp= maxpro;
                maxpro=minpro;
                minpro= temp;
            }
            maxpro= Math.max(arr[i], maxpro*arr[i]);
            minpro= Math.min(arr[i], minpro*arr[i]);
            res= Math.max(res, maxpro);
        }
        return res;
    }
}