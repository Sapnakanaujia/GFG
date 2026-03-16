class Solution {
    public int getSecondLargest(int[] arr) {
        int secondmax=Integer.MIN_VALUE;
        int max= Integer.MIN_VALUE;;
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secondmax= max;
                max= arr[i];
            }
            else if(arr[i]>secondmax && arr[i]!=max){
                secondmax=arr[i];
            
            }
        }
        if(secondmax!= Integer.MIN_VALUE){
            return secondmax;
        }
        return -1;
    }
}