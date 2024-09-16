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
    bool isBalanced(TreeNode* root) {
        if(root==NULL) return true;
        
        int left = height(root->left);
        int right = height(root->right);
        
        if(abs(left-right)<=1 && isBalanced(root->left) && isBalanced(root->right)) return true;
        return false;
    }
    
    int height(TreeNode* node) {
        if(node==NULL) return 0;
        
        int l = height(node->left);
        int r = height(node->right);
        
        return max(l,r)+1;
    }
};