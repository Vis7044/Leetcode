class Solution {
public:
    int solve(int i, int buy,vector<int>& prices,vector<vector<int>> &dp) {
        if(i==prices.size()) return 0;
        int profit=0;
        if(dp[i][buy]!=-1) return dp[i][buy];
        if(buy) {
            profit = max(-prices[i] + solve(i+1,0,prices,dp), 0 + solve(i+1,1,prices,dp));
        }else {
            profit = max(prices[i] + solve(i+1,1,prices,dp), 0 + solve(i+1,0,prices,dp));
        }
        return dp[i][buy] = profit;
    }
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        int aheadBuy=0,aheadNotBuy=0,currBuy=0,currNotBuy=0;
        
        for(int i=n-1;i>=0;i--) {
            currBuy = max(-prices[i]+aheadNotBuy, 0 + aheadBuy);
            currNotBuy = max(prices[i]+aheadBuy, 0 + aheadNotBuy);
            aheadBuy = currBuy;
            aheadNotBuy = currNotBuy;
        }
        return aheadBuy;
    }
};