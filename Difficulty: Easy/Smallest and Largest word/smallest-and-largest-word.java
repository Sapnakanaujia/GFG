class Solution {
    public ArrayList<String> smallerAndLarge(String s) {
        // code here
        ArrayList<String> ans= new ArrayList<>();
        
        String[] arr= s.trim().split("\\s+");
        String maxword= arr[0];
        String minword=arr[0];
        for (String word:arr){
            if(word.length()<minword.length()){
                minword= word;
            }
            if(word.length()>=maxword.length()){
                maxword= word;
            }
        }
        ans.add(minword);
        ans.add(maxword);
        return ans;
    }
}