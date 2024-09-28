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
    vector<vector<int>> verticalTraversal(TreeNode* root) {
        map<int,map<int,multiset<int>>> mp;
        queue<pair<TreeNode *,pair<int,int>>> q;
        q.push({root,{0,0}});
        while(!q.empty()) {
            auto p = q.front();
            q.pop();
            TreeNode * node = p.first;
            int x = p.second.first, y = p.second.second;
            mp[x][y].insert(node->val);
            if(node->left) q.push({node->left, {x-1,y+1}});
            if(node->right) q.push({node->right, {x+1,y+1}});
        }
        vector<vector<int>> ans;
        for(auto p: mp) {
            vector<int> temp;
            for(auto q: p.second) {
                // temp.insert(temp.end(),q.second.begin(),q.second.end());
                for(auto it: q.second) {
                    temp.push_back(it);
                }
            }
            ans.push_back(temp);
        }
        return ans;
    }
};