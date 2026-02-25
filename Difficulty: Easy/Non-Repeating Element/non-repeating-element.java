// User function Template for Java

class Solution {
    public int firstNonRepeating(int[] arr) {
        int n= arr.length;
        HashMap<Integer, Integer> mp= new HashMap<>();
        for(int i=0;i<n;i++){
            int key=arr[i];
            mp.put(key, mp.getOrDefault(key, 0) + 1);
            
        }
        for(int i=0;i<n;i++){
            if (mp.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return 0;
    }
}
