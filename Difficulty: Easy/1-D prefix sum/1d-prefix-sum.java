class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        int n= arr.length;
        ArrayList<Integer> al= new ArrayList<>();
        int[] prefix= new int[n];
        prefix[0]= arr[0];
        al.add(prefix[0]);
        for(int i=1;i<n;i++){
            
            prefix[i]=prefix[i-1]+arr[i];
            al.add(prefix[i]);
        }
        
        return al;
    }
}