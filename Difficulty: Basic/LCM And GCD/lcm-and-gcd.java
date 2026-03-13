class Solution {
       public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public static int[] lcmAndGcd(int a, int b) {
        int g= gcd(a,b);
        int l = (a*b)/g;
    return new int[]{l,g};
    }
   
}