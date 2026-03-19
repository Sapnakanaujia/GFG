// User function Template for Java

class Solution {
    int findMaxAverage(int[] arr, int n, int k) {
        // code here
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxsum=sum;
        int index=0;
        for(int i=k;i<n;i++){
            sum=sum+arr[i]-arr[i-k];
            if(sum>maxsum){
                maxsum= sum;
                index=i-k+1;
            }
        }
        return index;
    }
}
