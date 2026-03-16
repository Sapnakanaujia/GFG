class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> al= new ArrayList<>();
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
               set.add(arr[i]);
               al.add(arr[i]);
            }
        }
        return al;
    }
}
