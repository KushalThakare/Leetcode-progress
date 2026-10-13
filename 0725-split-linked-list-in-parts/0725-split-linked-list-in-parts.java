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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        int len = 0;
        ListNode dum = head;
        int ind = 0;
        while (dum != null) {
            dum = dum.next;
            len++;
        }

        int sizes = len / k;
        int extra = len % k;
        ListNode curr = head;
        ListNode prev = null;

        for(int j=0; j<k; j++) {

            if(curr==null){
                ans[ind] = curr;
                ind++;
                continue;
            }

            ans[ind] = curr;
            ind++;
            int width = sizes;

            if (extra > 0) {
                width++;
                extra--;
            }

            for (int i = 0; i < width; i++) {
                prev = curr;
                curr = curr.next;
            }

            prev.next = null;
            prev = null;

        }

        return ans;
    }
}