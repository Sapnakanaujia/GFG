class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        int n= arr.length;
        // int cnt=1;
        int [] freq= new int[n+1];
        List<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
           if(arr[i]<=n){
               freq[arr[i]]++;
           }
        }
        for(int i=1;i<=n;i++){
            al.add(freq[i]);
        }
        return al;
    }
}
