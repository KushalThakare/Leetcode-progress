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
        ListNode temp = head;
        int n = 0;
        ListNode s1 = head;
        ListNode s2 = head;

        while(temp!=null){
            if(n==k-1){
                s1=temp;
            }
            n++;
            temp = temp.next;
        }

        for(int i=0; i<n-k;i++){
            s2 = s2.next;
        }

        int t = s1.val;
        s1.val = s2.val;
        s2.val = t;
        return head;
    }
}