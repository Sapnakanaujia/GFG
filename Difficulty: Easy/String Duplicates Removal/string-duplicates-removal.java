// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        boolean[] seen = new boolean [256];
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
         if(!seen[ch]) {
             seen[ch]=true;
             res.append(ch);
         }  
        }
        return res.toString();
    }
}
