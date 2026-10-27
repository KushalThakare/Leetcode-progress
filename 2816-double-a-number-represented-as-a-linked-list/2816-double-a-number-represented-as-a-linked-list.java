/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode doubleIt(ListNode head) {
        //reverse
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        //double
        curr = prev;

        int digit =0;
        int carry = 0;
        while(curr!= null){
            int sum = curr.val*2 + carry;

            curr.val = sum%10;
            carry = sum/10;

            curr = curr.next;
        }

        if(carry!=0){
            ListNode last = new ListNode(carry);
            last.next = null;
            head.next = last;
            head = head.next;
        }
        //reverse again

        curr = prev;
        prev = null;
          while(curr!=null){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        return head;
    }
}