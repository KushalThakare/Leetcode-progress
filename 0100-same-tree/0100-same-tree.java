/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        //ek bhi value same nhi nikla to false return kro
        if(p==null && q==null){
            return true;
        }
        else if(p ==null||q==null){
            return false;
        }

        if(p.val!=q.val){
            return false;
        }

        // check right k values
        boolean left = isSameTree(p.left, q.left);
        //check left k values
        boolean right = isSameTree(p.right, q.right);

        return left && right;
        
    }
}