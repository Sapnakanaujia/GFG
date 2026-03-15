import java.util.*;
class Solution {
    public int maxCircularSum(int arr[]) {
        int n=arr.length;
        int total= 0;
        for(int num:arr)total+=num;
        int maxPrefix= arr[0];
        int maxSubSum = maxPrefix;
        int minPrefix= arr[0];
        int minSubSum = minPrefix;
        
        for(int i=1;i<n;i++){
            maxPrefix= Math.max(maxPrefix+arr[i], arr[i]);
            maxSubSum= Math.max(maxSubSum, maxPrefix);
            
            minPrefix= Math.min(minPrefix+arr[i], arr[i]);
            minSubSum= Math.min(minSubSum, minPrefix);
            
        }
        int ans1= maxSubSum;
        int ans2= total- minSubSum;
        if(ans2==0){
            return ans1;
        }
        return Math.max(ans1, ans2);
    }
}
