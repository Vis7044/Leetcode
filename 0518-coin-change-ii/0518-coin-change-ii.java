class Solution {
    public int solve(int ind,int am,int []coins, int [][]dp) {
        if(ind==0) {
            if(am==0 || am%coins[0]==0) return 1;
            else return 0;
        }
        if(dp[ind][am]!=-1) return dp[ind][am];
        int ntake = solve(ind-1,am,coins,dp);
        int take = 0;
        if(coins[ind]<=am) take = solve(ind,am-coins[ind],coins,dp);
        return dp[ind][am]=take+ntake;
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        
        for(int[]arr: dp) {
            Arrays.fill(arr,-1);
            
        }
        return solve(n-1,amount,coins,dp);
    }
}