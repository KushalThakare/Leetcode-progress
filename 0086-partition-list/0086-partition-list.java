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
    public ListNode partition(ListNode head, int x) {
        ListNode gh = new ListNode(-1);
        ListNode gt = gh;

        ListNode lh = new ListNode(-1);
        ListNode lt = lh;

        ListNode curr = head;

        while (curr != null) {
            if (curr.val < x) {
                ListNode nodetoadd = curr;
                 curr = curr.next;
                 nodetoadd.next = null;
                lt.next = nodetoadd;
                lt = nodetoadd;
            } else {
                ListNode nodetoadd = curr;
                 curr = curr.next;
                  nodetoadd.next = null;
                gt.next = nodetoadd;
                gt = nodetoadd;
                
            }
           
        }

        lt.next = gh.next;
        return lh.next;

    }
}