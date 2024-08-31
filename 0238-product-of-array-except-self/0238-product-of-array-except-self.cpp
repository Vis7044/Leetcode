class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n=nums.size();
        vector<int>ans(n,1);

        int pr=1,su=1;
        for(int i=0;i<n;i++) {
            ans[i]=pr;
            pr=pr*nums[i];
        }
        for(int i=n-1;i>=0;i--) {
            ans[i] = ans[i]*su;
            su=su*nums[i];
            
        }
        return ans;
    }
};