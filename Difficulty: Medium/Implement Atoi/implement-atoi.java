import java.util.*;
class Solution {
    public int myAtoi(String s) {
        // code here
         int i = 0, n = s.length();
        while(i<n && s.charAt(i)==' '){
            i++;
        }       
        if(i==n) return 0;
        
        int sign=1;
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(s.charAt(i)=='+'){
            i++;
        }
        
        while(i<n && s.charAt(i)=='0'){
            i++;
        }
        long num=0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            num= num*10+digit;
            
            if(sign==1 && num>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign == -1 && -num < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(sign*num);
    }
}