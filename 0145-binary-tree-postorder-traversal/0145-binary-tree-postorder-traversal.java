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
    public void solve(List<Integer> ans, TreeNode root, TreeNode ptr){
        if(ptr==null){
            return;
        }

        solve(ans, root, ptr.left);
     
        solve(ans, root, ptr.right);

           ans.add(ptr.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        TreeNode ptr = root;
        solve(ans, root, ptr);

        return ans;
    }
}