import java.util.*;

class Solution {
    static void relativeSort(int[] a1, int[] a2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: count frequency
        for (int num : a1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int k = 0;

        // Step 2: follow a2 order
        for (int num : a2) {
            if (map.containsKey(num)) {
                int freq = map.get(num);
                while (freq-- > 0) {
                    a1[k++] = num;
                }
                map.remove(num);
            }
        }

        // Step 3: remaining elements
        ArrayList<Integer> list = new ArrayList<>();
        for (int key : map.keySet()) {
            int freq = map.get(key);
            while (freq-- > 0) {
                list.add(key);
            }
        }

        Collections.sort(list);

        // Step 4: add back
        for (int num : list) {
            a1[k++] = num;
        }
    }
}