class Solution {
    public int solve(int ind, int []nums, int sum ,int dp[][]) {
        if(ind==0) {
            if(sum==0 && nums[0]==0) return 2;
            if(sum==0 || sum==nums[0]) return 1;
            return 0;
        }
        if(dp[ind][sum]!=-1) return dp[ind][sum];
        int ntake = solve(ind-1,nums,sum,dp);
        int take=0;
        if(nums[ind]<=sum) take = solve(ind-1,nums,sum-nums[ind],dp);
        return dp[ind][sum] = take+ntake;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int num: nums) {
            sum+=num;
        }
        if(sum-target<0 || (sum-target)%2!=0) return 0;
        int s2 = (sum - target) / 2;

        int dp[][] = new int[nums.length][s2 + 1];

        for (int row[] : dp)
            Arrays.fill(row, -1);
        return solve(nums.length-1,nums,s2,dp);  
    }
}