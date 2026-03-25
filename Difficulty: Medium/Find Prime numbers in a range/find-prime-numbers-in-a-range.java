// User function Template for Java

class Solution {
    boolean isprime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
        
    }
    
    ArrayList<Integer> primeRange(int M, int N) {
        // code here
        ArrayList<Integer> al= new ArrayList<>();
        
        
        
        for(int i=M;i<=N;i++){
            if(isprime(i)){
                al.add(i);
            }
        }
        return al;
    }
}