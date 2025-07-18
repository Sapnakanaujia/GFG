// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n= arr.length;
        d=d%n;
        int[] temp= new int[n];
        for(int i=0;i<=n-1;i++){
            temp[(i+n-d)%n]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        
    }
}