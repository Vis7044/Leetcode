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
        bool lr= false;
        while(!q.empty()) {
            int n = q.size();
            vector<int> temp;
            for(int i=0;i<n;i++) {
                TreeNode *n = q.front();
                if(n->left) q.push(n->left);
                if(n->right) q.push(n->right);
                temp.push_back(n->val);
                q.pop();
            }
            if(lr) {
                reverse(temp.begin(),temp.end());
            }
            ans.push_back(temp);
            lr = !lr;
        }
        return ans;
    }
};