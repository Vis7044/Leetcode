class Solution {
public:
    int solve(int ind,int buy,int fee, vector<int> prices,vector<vector<int>> &dp) {
        if(ind==prices.size()) return 0;
        if(dp[ind][buy]!=-1) return dp[ind][buy];
        if(buy) {
            return dp[ind][buy]= max(-prices[ind] + solve(ind+1,0,fee,prices,dp),
                        0 + solve(ind+1,1,fee,prices,dp));
        } else {
            return dp[ind][buy]= max(prices[ind]-fee + solve(ind+1,1,fee,prices,dp),
                        0 + solve(ind+1,0,fee,prices,dp));
        }
    }
    int maxProfit(vector<int>& prices, int fee) {
        int n = prices.size();
        vector<vector<int>> dp(n+1,vector<int>(2,0));
        
        for(int ind=n-1;ind>=0;ind--) {
            dp[ind][1]= max(-prices[ind] + dp[ind+1][0],
                        0 + dp[ind+1][1]);

            dp[ind][0]= max(prices[ind]-fee + dp[ind+1][1],
                        0 + dp[ind+1][0]);
        }
        return dp[0][1];
    }
};