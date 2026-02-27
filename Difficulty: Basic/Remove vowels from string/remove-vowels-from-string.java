// User function Template for Java

class Solution {
    
    String removeVowels(String s) {
        StringBuilder res= new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                continue;
            }
            res.append(ch);
        }
        return res.toString();
    }
}