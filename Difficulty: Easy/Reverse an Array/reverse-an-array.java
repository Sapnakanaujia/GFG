class Solution {
    public void reverseArray(int arr[]) {
        int n= arr.length;
        int temp=0;
        int i=0,j=n-1;
        while(i<j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        
    }