class Solution {
public:
    int solve(int i,int j, vector<vector<int>> & obs, vector<vector<int>>&dp) {
        if(i==0 && j==0 && obs[i][j]!=1) return 1;
        if(obs[i][j]==1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int up=0,left=0;
        
        if(i>0) up = solve(i-1,j,obs,dp);
        if(j>0) left = solve(i,j-1,obs,dp);
        return dp[i][j]= up+left;
    }
    int uniquePathsWithObstacles(vector<vector<int>>& obstacleGrid) {
        int n = obstacleGrid.size(),m = obstacleGrid[0].size();
        vector<vector<int>>dp(n,vector<int>(m,-1));
        return solve(n-1,m-1,obstacleGrid, dp);
    }
};