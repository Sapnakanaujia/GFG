
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        int m=a.length, n= b.length;
        while(i<m && j<n){
            if(a[i]<b[j]) i++;
            else if(a[i] == b[j]) {
                i++;
                j++;
            }
            else{
                return false;
            }
        }
        return (j==n);
    }
}
