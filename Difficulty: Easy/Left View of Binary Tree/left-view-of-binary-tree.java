/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
      public int levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
     public void preorder(Node root, int level, ArrayList<Integer> list){
        if(root==null) return;
        list.set(level,root.data);
        preorder(root.right,level+1,list);
        preorder(root.left, level+1,list);
    }
    public ArrayList<Integer> leftView(Node root) {
          ArrayList<Integer> list= new ArrayList<>();
        int n = levels(root);
        for(int i=0;i<n;i++){
            list.add(-1);
        }
        preorder(root,0,list);
        return list;
        
    }
}