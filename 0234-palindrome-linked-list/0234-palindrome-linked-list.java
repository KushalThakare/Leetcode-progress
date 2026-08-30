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
    public ListNode midpt(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast= fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public ListNode rev(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode forward = curr.next;

            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;

    }
    public boolean isPalindrome(ListNode head) {

        if(head.next==null){
            return true;
        }
        // get midpoint
        ListNode mid = midpt(head);

        ListNode temp1 = head;
        while(temp1.next!=mid){
            temp1 = temp1.next;
        }
        temp1.next = null;
        //reverse one list

        ListNode head1 = head;
        ListNode head2 = rev(mid);
        //compare both

        while(head1!=null && head2!=null){
            if(head1.val != head2.val){
                return false;
            }else{
                head1 = head1.next;
                head2 = head2.next;
            }
        }

        return true;
    }
}