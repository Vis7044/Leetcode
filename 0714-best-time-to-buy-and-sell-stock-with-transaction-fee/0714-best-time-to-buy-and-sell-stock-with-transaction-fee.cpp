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
        vector<int> front(2,0);
        vector<int> curr(2,0);

        for(int ind=n-1;ind>=0;ind--) {
            curr[1]= max(-prices[ind] + front[0],
                        0 + front[1]);

            curr[0]= max(prices[ind]-fee + front[1],
                        0 + front[0]);
                    
            front=curr;
        }
        return front[1];
    }
};