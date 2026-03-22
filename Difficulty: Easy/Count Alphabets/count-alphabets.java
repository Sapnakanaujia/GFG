// User function Template for Java

class Solution {
    static int Count(String s) {
        // code here
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                count++;
            }
        }
        return count;
    }
}