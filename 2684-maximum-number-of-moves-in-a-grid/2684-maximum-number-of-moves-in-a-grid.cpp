class Solution {
public:
    int solve(int row,int col, vector<vector<int>>& grid, vector<vector<int>>& dp,int n,int m) {
        
        if(dp[row][col]!=-1) return dp[row][col];
        int delrow[] = {-1,0,1};
        int delcol[] = {1,1,1};
        int maxi = 0;
        for(int i=0;i<3;i++) {
            int nrow = row+delrow[i];
            int ncol = col + delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[row][col]<grid[nrow][ncol]) {
                
                maxi = max(maxi,1+solve(nrow,ncol,grid,dp,n,m));
            }
        }
        return dp[row][col] = maxi;
    }
    int maxMoves(vector<vector<int>>& grid) {
        int n = grid.size();
        int m = grid[0].size();
        vector<vector<int>> dp(n,vector<int>(m,-1));
        int maxi=0;
        for(int i=0;i<n;i++) {
            int moves = solve(i,0,grid,dp,n,m);
            maxi = max(maxi,moves);
        }
        return maxi;
    }
};