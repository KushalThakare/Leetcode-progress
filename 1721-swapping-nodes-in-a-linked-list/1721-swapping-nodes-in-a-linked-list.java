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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode start = head;
        ListNode end = head;

        for(int i=0; i<k-1; i++){
            start = start.next;
        }
        ListNode curr = start.next;

        while(curr!=null){
            curr = curr.next;
            end = end.next;
        }

        int t = start.val;
        start.val = end.val;
        end.val = t;
        return head;
    }
}