import java.util.*;

class Solution {
    int[] printKClosest(int[] arr, int k, int x) {
        int n = arr.length;
        List<Integer> list = new ArrayList<>();

        // Case 1: x is smaller than smallest element
        if (x < arr[0]) {
            for (int i = 0; i < k && i < n; i++) {
                if (arr[i] != x) list.add(arr[i]);
            }
        }
        // Case 2: x is larger than largest element
        else if (x > arr[n - 1]) {
            for (int i = n - 1; i >= 0 && k > 0; i--) {
                if (arr[i] == x) continue;
                list.add(arr[i]);
                k--;
            }
        }
        // Case 3: x lies inside the range
        else {
            // Find lower bound
            int lb = n, lo = 0, hi = n - 1;
            while (lo <= hi) {
                int mid = (lo + hi) / 2;
                if (arr[mid] >= x) {
                    lb = mid;
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }

            int i = lb - 1, j = lb;
            while (k > 0 && i >= 0 && j < n) {
                if (arr[i] == x) { i--; continue; }
                if (arr[j] == x) { j++; continue; }

                int di = Math.abs(x - arr[i]);
                int dj = Math.abs(x - arr[j]);

                // FIX: prefer right side if equal distance
                if (di < dj) {
                    list.add(arr[i--]);
                } else {
                    list.add(arr[j++]);
                }
                k--;
            }

            while (i >= 0 && k > 0) {
                if (arr[i] != x) {
                    list.add(arr[i]);
                    k--;
                }
                i--;
            }
            while (j < n && k > 0) {
                if (arr[j] != x) {
                    list.add(arr[j]);
                    k--;
                }
                j++;
            }
        }

        // Convert List<Integer> to int[]
        int[] ans = new int[list.size()];
        for (int idx = 0; idx < list.size(); idx++) {
            ans[idx] = list.get(idx);
        }
        return ans;
    }
}
