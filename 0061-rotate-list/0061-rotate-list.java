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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }

        int size =1;
        ListNode curr = head;
        while(curr.next!=null){
            size++;
            curr = curr.next;
        }
        curr.next = head;
        k = k%size;

        curr = head;
        int i = size-k-1;
        while(i>0){
            curr = curr.next;
            i--;
        }

        ListNode ans = curr.next;
        curr.next = null;
        return ans;
    }
}