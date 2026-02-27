// User function Template for Java

class Solution {
    String removeSpecialCharacter(String s) {
        StringBuilder res= new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch>='a' && ch <='z' || ch>='A' && ch<='Z'){
                res.append(ch);
            }
        }
            if (res.length() == 0) {
            return "-1";
        
        }
        return res.toString();
    }
}