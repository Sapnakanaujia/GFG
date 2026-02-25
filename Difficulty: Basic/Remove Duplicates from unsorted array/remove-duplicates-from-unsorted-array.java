// User function Template for Java

class Solution {

    static ArrayList<Integer> removeDuplicate(int arr[]) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n=arr.length;
        ArrayList<Integer> res= new ArrayList<>();
        
        for(int i=0;i<n;i++){

           if(!mp.containsKey(arr[i])){
               mp.put(arr[i],1);
               res.add(arr[i]);
           }
        }
        return res;
    }
}