class Solution {
//     int solve(int ind, int am,int []coins,int dp[][]) {
//         if(ind==0) {
//             if(am%coins[ind]==0) return am/coins[ind];
//             return (int)1e9;
//         }
//         if(dp[ind][am] != -1) return dp[ind][am];
//         int ntake=0+ solve(ind-1,am,coins,dp);
//         int take = Integer.MAX_VALUE;
//         if(coins[ind]<=am) take = 1 + solve(ind,am-coins[ind],coins,dp);
        
//         return dp[ind][am] = Math.min(take,ntake);
//     }
    // public int coinChange(int[] coins, int amount) {
    //     if(amount==0) return 0;
    //     int n = coins.length;
    //     int dp[][] = new int[n][amount+1];
    //     for(int ar[]: dp) {
    //         Arrays.fill(ar, -1);
    //     }
    //     int sol =  solve(n-1,amount,coins,dp);
    //     if(sol==(int)1e9) return -1;
    //     return sol;
    // }
    
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        for(int ar[]: dp) {
            Arrays.fill(ar, 0);
        }
        for(int tar=0;tar<=amount;tar++) {
            if(tar%coins[0]==0) dp[0][tar]=tar/coins[0];
            else dp[0][tar]=(int)1e9;
        }
        
        
        for(int ind=1;ind<n;ind++) {
            for(int am=0;am<=amount;am++) {
                int ntake=0+ dp[ind-1][am];
                int take = Integer.MAX_VALUE;
                if(coins[ind]<=am) take = 1 +dp[ind][am-coins[ind]];

                dp[ind][am] = Math.min(take,ntake);
              }
      }
        if(dp[n-1][amount]>=(int)1e9) return -1;
        return dp[n-1][amount];

}
}
