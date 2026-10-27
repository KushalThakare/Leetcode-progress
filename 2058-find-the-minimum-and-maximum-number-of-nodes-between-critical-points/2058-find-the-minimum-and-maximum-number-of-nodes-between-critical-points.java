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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null){
            return new int[]{-1, -1};

        }

        ListNode prev = head;
        ListNode curr = head.next;
        int i =1;

        List<Integer> crits = new ArrayList<>();

        while(curr!=null && curr.next!=null){
            if(curr.val>prev.val && curr.val>curr.next.val){
                //local maxima
                crits.add(i);
            }
            if(curr.val<prev.val && curr.val<curr.next.val){
                //local minima
                crits.add(i);
            }

            prev = prev.next;
            curr = curr.next;
            i++;
        }
        //crits are ready
        if(crits.size()<2){
            return new int[]{-1,-1};
        }

        int maxdist = crits.get(crits.size()-1) - crits.get(0);
        int mindist = Integer.MAX_VALUE;

        for(int ind=1; ind<crits.size(); ind++){
            mindist = Math.min(mindist, crits.get(ind)-crits.get(ind-1));
        }

        return new int[]{mindist, maxdist};
    }
}