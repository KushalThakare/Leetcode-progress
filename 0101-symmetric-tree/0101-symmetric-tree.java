class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        return solve(root.left, root.right);
    }

    public boolean solve(TreeNode left, TreeNode right) {

        // Both are null
        if(left == null && right == null) return true;

        // Only one is null
        if(left == null || right == null) return false;

        // Values don't match
        if(left.val != right.val) return false;

        // Compare mirrored children
        return solve(left.left, right.right) &&
               solve(left.right, right.left);
    }
}