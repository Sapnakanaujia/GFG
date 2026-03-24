class Solution {
    int firstOccurence(String txt, String pat) {
     int m= txt.length();
     int n= pat.length();
     for(int i=0;i<=m-n;i++){
         int j;
         for(j=0;j<n;j++){
             if(txt.charAt(i+j)!=pat.charAt(j)) break;
         }
         if(j==n) return i;
     }
     return -1;
    }
}