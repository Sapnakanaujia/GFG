class Solution {
    void swap(int[] arr, int i, int j){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        int n=arr.length;
        // code here
         
        for(int i=1;i<n;i++){
            for(int j=i;j>=1;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
}