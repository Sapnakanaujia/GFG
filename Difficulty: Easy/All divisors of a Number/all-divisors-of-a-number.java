import java.util.*;

class Solution {
    public static void print_divisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                list.add(i);
                if(i != n / i) {
                    list.add(n / i);
                }
            }
        }

        Collections.sort(list);

        for(int x : list) {
            System.out.print(x + " ");
        }
    }
}