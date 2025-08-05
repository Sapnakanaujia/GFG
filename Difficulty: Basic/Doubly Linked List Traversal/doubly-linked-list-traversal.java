// User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public static ArrayList<Integer> displayList(Node head) {
        ArrayList<Integer> forward = new ArrayList<>();
        ArrayList<Integer> backward = new ArrayList<>();
        // Node curr=head;
        // Node last=null;
        while(head!=null){
           forward.add(head.data);
           //last=curr;
           head=head.next;
        }
        return forward;
        
        //  while(head!=null){
        //   backward.add(head.data);
        //   head=head.prev;
        // }
        // return backward;
        //   ArrayList<Integer> result = new ArrayList<>();
        //   result.add(forward);
        //   result.add(backward);
        //   return result;
    }
}