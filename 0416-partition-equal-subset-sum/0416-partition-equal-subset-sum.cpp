class Solution {
public:
    bool solve(int ind, vector<int>& nums,int sum,vector<vector<int>>&dp) {
        if(sum==0) return true;
        if(ind==nums.size()) {
            return sum==0;
        }
        if(dp[ind][sum]!=-1) return dp[ind][sum];
        int ntake = solve(ind+1,nums,sum,dp);
        int take = false;
        if(nums[ind]<=sum) take = solve(ind+1,nums,sum-nums[ind],dp);
        return dp[ind][sum]= take||ntake;
    }
    bool canPartition(vector<int>& nums) {
        int sum=0;
        int n = nums.size();
        for(int i=0;i<n;i++) {
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        vector<vector<int>>dp(n,vector<int>(sum+1,-1));
        return solve(0,nums,sum/2,dp);
    }
};