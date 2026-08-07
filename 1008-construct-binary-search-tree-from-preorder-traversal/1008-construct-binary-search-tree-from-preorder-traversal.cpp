/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int index=0;
    TreeNode*Preorder(vector<int>&preorder,long long high){
        if(index==preorder.size()||preorder[index]>high) return nullptr;
        TreeNode*root=new TreeNode(preorder[index]);
        index++;
        root->left=Preorder(preorder,root->val);
        root->right=Preorder(preorder,high);

        return root;
    }
    TreeNode* bstFromPreorder(vector<int>& preorder) {
        return Preorder(preorder,LLONG_MAX);
        
    }
};