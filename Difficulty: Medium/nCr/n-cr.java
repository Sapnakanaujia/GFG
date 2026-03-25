class Solution {
    public int nCr(int n, int r) {
        // code here
           if(r>n) return 0;
           long res=1;
           r= Math.min(r, n-r);
           for(int i=0;i<r;i++){
               res=res*(n-i);
               res=res/(i+1);
           }
           return (int)res;
    }
}