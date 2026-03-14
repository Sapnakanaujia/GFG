class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> list= new ArrayList<>();
        list.add(0);
        list.add(0);
        int n=arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(int i=1;i<=n;i++){
            int cnt=map.getOrDefault(i,0);
            if(cnt==0){
                list.set(1,i);
            }
            if(cnt==2){
                list.set(0,i);
            }
        }
        return list;
    }
}
