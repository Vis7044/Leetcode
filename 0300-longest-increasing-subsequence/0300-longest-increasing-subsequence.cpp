class Solution {
public:
    int solve(int ind,int prev_ind,vector<int>nums,vector<vector<int>>&dp ) {
        if(ind==nums.size()) return 0;
        if(dp[ind][prev_ind+1]!=-1) return dp[ind][prev_ind+1];
        int len = 0 + solve(ind+1,prev_ind,nums,dp);
        if(prev_ind==-1 || nums[ind]>nums[prev_ind]){
            len = max(len, 1 + solve(ind+1,ind,nums,dp));
        }
        return dp[ind][prev_ind+1]= len;
    }
    int lengthOfLIS(vector<int>& nums) {
        int n = nums.size();
        vector<int> dp(n,1);

        for(int ind=0;ind<n;ind++) {
            for(int prev=0;prev<=ind-1;prev++) {
                if(nums[prev]<nums[ind]) {
                    dp[ind] = max(1 + dp[prev], dp[ind]);
                }
            }
        }
        int ans = 0;
        for(int i=0;i<n;i++) {
            ans = max(ans,dp[i]);
        }

        return ans;
    }
};