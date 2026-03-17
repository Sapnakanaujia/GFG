// User function Template for Java

class Solution {
    String equilibrium(int arr[]) {
        int sum=0;
        int left=0;
        for(int num:arr) sum+=num;
        for(int i=0;i<arr.length;i++){
            int right= sum-left-arr[i];
            if(left==right) return "true";
            left+=arr[i];
        }
        return "false";
    }
}