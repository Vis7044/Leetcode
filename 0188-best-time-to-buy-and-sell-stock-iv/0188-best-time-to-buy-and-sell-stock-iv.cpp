class Solution {
public:
    int solve(int ind,int buy, int cap,vector<int>&prices,vector<vector<vector<int>>> &dp) {
        if(ind==prices.size() || cap==0) return 0;

        if(dp[ind][buy][cap]!=-1) return dp[ind][buy][cap];
        if(buy) {
            return dp[ind][buy][cap] = max(-prices[ind] + solve(ind+1,0,cap,prices,dp),
                        0 + solve(ind+1, 1, cap,prices,dp));
        }else {
            return dp[ind][buy][cap]= max(prices[ind] + solve(ind+1,1,cap-1,prices,dp),
                        0 + solve(ind+1,0,cap, prices,dp));
        }
    }
    int maxProfit(int k, vector<int>& prices) {
        int n = prices.size();
        vector<vector<int>> after(2, vector<int>(k+1,0));
        vector<vector<int>> current(2, vector<int>(k+1,0));
        
        for(int ind=n-1;ind>=0;ind--) {
            for(int buy=0;buy<=1;buy++) {
                for(int cap=1;cap<=k;cap++) {
                    if(buy) {
                        current[buy][cap] = max(-prices[ind] + after[0][cap],
                                    0 + after[1][cap]);
                    }else {
                        current[buy][cap]= max(prices[ind] + after[1][cap-1],
                                    0 + after[0][cap]);
                    }
                }
                after = current;
            }
           
        }
        return after[1][k];
    }
};