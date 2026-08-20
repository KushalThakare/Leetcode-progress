class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nxt = curr.next;  // save next node
            curr.next = prev;          // reverse link
            prev = curr;               // move prev
            curr = nxt;                // move curr
        }

        return prev;
    }
}