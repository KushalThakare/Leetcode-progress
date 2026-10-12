/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean cycle = false;

        while(fast!=null){
            fast = fast.next;
            if(fast!=null){
                fast = fast.next;
                slow = slow.next;
            }

            if(fast==slow){
                cycle = true;
                break;
            }

        }

        if(cycle==false){
            return null;
        }
        slow = head;

        while(fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }

        return fast;

    }
}