// User function Template for Java
import java.util.*;
class Solution {
    static String encryptString(String s) {
        // code here
        StringBuilder res= new StringBuilder();
        int n= s.length();
      
        int i=0;
        while(i<n){
              int cnt=0;
            char ch= s.charAt(i);
            while(i<n && s.charAt(i)==ch){
                cnt++;
                i++;
            }
            String hex=Integer.toHexString(cnt);
            StringBuilder revhex= new StringBuilder(hex).reverse(); 
            res.append(ch);
            res.append(revhex);
        }
        return res.reverse().toString();
    }
};