/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null){
            return head;
        }

        Node cur = head;

        while(cur!= null){
            if(cur.child==null){
                cur = cur.next;
            }
            else{
                //manipulating links

                Node nxt = cur.next;
                Node chcur = cur.child;
                cur.child = null;

                cur.next = chcur;
                chcur.prev = cur;

                while(chcur.next!= null){
                    chcur = chcur.next;
                }

                chcur.next = nxt;
                if(nxt!=null){
                nxt.prev = chcur;}
            }
        }

        return head;
    }
}