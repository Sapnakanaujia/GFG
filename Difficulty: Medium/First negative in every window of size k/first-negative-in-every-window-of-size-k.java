import java.util.*;

class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> res = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            
            // Step 1: Agar current element negative hai → add index
            if(arr[i] < 0){
                dq.addLast(i);
            }
            
            // Step 2: Remove out of window indices
            if(!dq.isEmpty() && dq.peekFirst() <= i - k){
                dq.removeFirst();
            }
            
            // Step 3: Window complete hone par answer add karo
            if(i >= k - 1){
                if(dq.isEmpty()){
                    res.add(0);
                } else {
                    res.add(arr[dq.peekFirst()]);
                }
            }
        }
        
        return res;
    }
}