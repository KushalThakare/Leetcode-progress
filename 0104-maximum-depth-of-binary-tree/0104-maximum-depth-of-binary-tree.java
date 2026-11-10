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
    public int solve(TreeNode root, int curr, int max){
        //base case
        if(root == null){
            return Math.max(max, curr);
        }

        return Math.max(solve(root.left, curr+1, max), solve(root.right, curr+1, max));
        
    }
    public int maxDepth(TreeNode root) {
        return solve(root, 0, 0);
    }
}