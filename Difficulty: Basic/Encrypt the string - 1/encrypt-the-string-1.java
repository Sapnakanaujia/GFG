class Solution {
    String encryptString(String s) {
        StringBuilder ans = new StringBuilder();
        char[] arr = s.toCharArray();
        
        int i = 0;
        int j = 0;
        
        while (j < arr.length) {
            if (arr[i] == arr[j]) {
                j++;
            } else {
                ans.append(arr[i]);
                int n = j - i;
                ans.append(n);
                i = j;
            }
        }
        
        // handle last group
        ans.append(arr[i]);
        int n = j - i;
        ans.append(n);
        
        // reverse final string
        return ans.reverse().toString();
    }
}