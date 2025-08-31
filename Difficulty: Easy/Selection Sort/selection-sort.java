class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n=arr.length;
        int minidx=-1;
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minidx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minidx];
            arr[minidx]=temp;
        }
    }
}