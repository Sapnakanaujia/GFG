class Solution {
    
    public double findMedian(int[] arr) {
        Arrays.sort(arr);
        
        double median=0;
        int n= arr.length;
            if(n%2==0){
                median=(arr[n/2]+arr[n/2-1])/ 2.0;;
            }
            else{
                median= arr[n/2];
            }
    return median;
    }

}
