class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode prev = head;

        for(int i=0; i<n; i++){
            curr = curr.next;
        }

        if(curr == null){
            return head.next;
        }

        while(curr.next != null){
            curr = curr.next;
            prev = prev.next;
        }

        prev.next = prev.next.next;

        return head;
    }
}