import java.util.ArrayList;
class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        HashMap<Integer, Integer> mp= new HashMap<>();
        ArrayList<Integer> list= new ArrayList<>();
        
        int n= arr.length;
        
        for(int i=0;i<n;i++){
           mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
           
            if(i>=k){
                int prev=arr[i-k];
                mp.put(prev,mp.get(prev)-1);
                
                if(mp.get(prev)==0){
                    mp.remove(prev);
                }
            }
            
            if(i>=k-1){
                list.add(mp.size());
            }
        }
        
        return list;
        
    }
}