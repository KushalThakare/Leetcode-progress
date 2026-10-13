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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carr = 0;

        ListNode ansH = new ListNode(-1);
        ListNode ansT = ansH;

        while(l1 !=null || l2!=null || carr!=0){
            int sum = 0;

            if(l1!=null){
                sum = sum+l1.val;
                l1 = l1.next;
            }

            if(l2!=null){
                sum = sum+l2.val;
                l2 = l2.next;
            }

            sum = sum+carr;

            int digit = sum%10;
            carr = sum/10;

            ListNode temp = new ListNode(digit);
            ansT.next = temp;
            ansT = temp;
        }

        ansH = ansH.next;
        return ansH;
    }
}