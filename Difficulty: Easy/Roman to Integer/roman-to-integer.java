class Solution {
    public int romanToDecimal(String s) {
        // code here
        int[] val= new int[256];
        val['I']=1;
        val['V']=5;
        val['X']=10;
        val['L']=50;
        val['C']=100;
        val['D']=500;
        val['M']=1000;
        
        
         int sum=0;
         int prev=0;
        for(int i=s.length()-1;i>=0;i--){
          int curr= val[s.charAt(i)];
          if(curr<prev){
              sum-=curr;
          }
          else{
              sum+=curr;
          }
          prev=curr;
       }
       return sum;
    }
}