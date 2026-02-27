// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        StringBuilder res= new StringBuilder();
        for(int i=0;i<str1.length();i++){
           char ch= str1.charAt(i);
           if(str2.indexOf(ch)==-1) {
            res.append(ch);
        }
        
        }
        return res.toString();
    }
}