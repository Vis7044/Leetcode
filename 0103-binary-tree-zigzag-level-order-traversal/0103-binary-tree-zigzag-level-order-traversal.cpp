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
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        
        vector<vector<int>>ans;
        if(root==NULL) return ans;
        queue<TreeNode*>q;
        q.push(root);
        bool left_to_right=false;
        while(!q.empty()) {
            int n = q.size();
            vector<int>temp;
            for(int i=0;i<n;i++) {
                TreeNode * node = q.front();
                if(node->left) {
                    q.push(node->left);
                }
                if(node->right) {
                    q.push(node->right);
                }
                temp.push_back(node->val);
                q.pop();
            }
            if(left_to_right) reverse(temp.begin(),temp.end());
            ans.push_back(temp);
            
            left_to_right = !left_to_right;
        }
        return ans;
    }
};