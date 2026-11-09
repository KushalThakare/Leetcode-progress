class Solution {
    public void reorderList(ListNode head) {

        if(head == null || head.next == null || head.next.next == null){
            return;
        }

        ListNode curr = head;
        ListNode end = head.next;
        ListNode nxt = head.next;
        ListNode prev = head;

        while(end.next != null){
            end = end.next;
            prev = prev.next;
        }

        curr.next = end;
        end.next = nxt;
        prev.next = null;

        reorderList(nxt);
    }
}