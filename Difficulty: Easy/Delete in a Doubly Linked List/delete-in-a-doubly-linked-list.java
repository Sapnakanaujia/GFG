/*

Definition for doubly Link List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {
        if(head==null) return null;
        Node curr= head;
        for(int i=1;curr!=null && i<x;i++){
            curr=curr.next;
        }
        if(curr==null) return head;
        if(curr.prev!=null){
            curr.prev.next=curr.next;
        }
        if(curr.next!=null){
            curr.next.prev=curr.prev;
        }
        if(head==curr) head=curr.next;
        curr=null;
    return head;
    }
}