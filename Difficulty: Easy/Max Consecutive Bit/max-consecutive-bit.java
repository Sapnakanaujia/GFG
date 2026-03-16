import java.util.*;
class Solution {
    public int maxConsecBits(int[] arr) {
        int n=arr.length;
        int cnt=1;
        int max=1;
        // int max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i-1]==arr[i]){
                cnt++;
            }
            else{
                cnt=1;
            }
             max= Math.max(max, cnt);
        }
       
        return max;
    }
}
