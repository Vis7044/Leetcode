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
        vector<int> ahead(2,0), curr(2,0);
        
        for(int i=n-1;i>=0;i--) {
            for(int buy=1;buy>=0;buy--) {
                int profit=0;
                if(buy) {
                    profit = max(-prices[i] + ahead[0], 0 + ahead[1]);
                }else {
                    profit = max(prices[i] + ahead[1], 0 + ahead[0]);
                }
                curr[buy] = profit;
            }
            ahead=curr;
        }
        return curr[1];
    }
};