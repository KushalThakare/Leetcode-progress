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

    public ListNode solve(ListNode curr, ListNode prev){
        if(curr==null){
            return prev;
        }

        //one case

        ListNode forward = curr.next;
        curr.next = prev;
        prev = curr;
        curr = forward;
        
        return solve(curr, prev);
    }
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        ListNode ans = solve(curr, prev);

        return ans;
    }
}