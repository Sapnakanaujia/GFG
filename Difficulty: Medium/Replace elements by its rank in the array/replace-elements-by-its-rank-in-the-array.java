// User function Template for Java

class Solution {
    static int[] replaceWithRank(int arr[], int N) {
        
        int[] arr1= arr.clone();
        Arrays.sort(arr1);
        HashMap<Integer, Integer> mp= new HashMap<>();
        
        int rank =1;
        for(int i=0;i<arr1.length;i++){
            if(!mp.containsKey(arr1[i])){
                mp.put(arr1[i],rank);
                rank++;
            }
            
        }
        for(int i=0;i<N;i++){
            arr[i]=mp.get(arr[i]);
        }
        
        return arr;
    }
}
