class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        int n= arr.length;
        int small=Integer.MAX_VALUE;
        int secondsmall= Integer.MAX_VALUE;
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<small){
                secondsmall=small;
                small= arr[i];
               
            }
            else if(arr[i]<secondsmall && arr[i]!=small){
                secondsmall= arr[i];
               
            }
        }
        if(secondsmall==Integer.MAX_VALUE){
            al.add(-1);
        }
        else{
            al.add(small);
            al.add(secondsmall);
        }
      return al;
    }
}
