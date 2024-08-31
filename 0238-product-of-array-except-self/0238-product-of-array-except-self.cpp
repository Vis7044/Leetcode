class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n=nums.size();
        int pre[n];
        int suf[n];
        int pr=1,su=1;
        for(int i=0;i<n;i++) {
            pr=pr*nums[i];
            su=su*nums[nums.size()-1-i];
            pre[i] = pr;
            suf[nums.size()-1-i]=su;
        }
        vector<int>ans;
        for(int i=0;i<nums.size();i++) {
            if(i==0) {
                ans.push_back(suf[i+1]);
            }else if(i==nums.size()-1) ans.push_back(pre[i-1]);
            else ans.push_back(pre[i-1]*suf[i+1]);
        }
        return ans;
    }
};