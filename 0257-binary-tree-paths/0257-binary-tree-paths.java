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
    public void solve(TreeNode root, List<String> ans, String curr){
        //base case
        if(root.left==null && root.right==null){
            curr = curr + String.valueOf(root.val);
            ans.add(curr);
            return;
        }

        curr = curr+String.valueOf(root.val)+"->";
        if(root.left!=null){
            solve(root.left, ans, curr);
        }
        if(root.right!=null){
            solve(root.right, ans, curr);
        }
        return;
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        solve(root, ans, "");
        return ans;
    }
}