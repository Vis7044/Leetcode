class Solution {
public:
    void dfs(int row,int col,vector<vector<char>>& grid,vector<vector<int>>& vis,int n,int m) {
        vis[row][col]=1;
        int delrow[] = {1,0,-1,0};
        int delcol[] = {0,1,0,-1};
        for(int i=0;i<4;i++) {
            int nrow = row+delrow[i];
            int ncol = col + delcol[i];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && grid[nrow][ncol]=='1' && !vis[nrow][ncol]) {
                dfs(nrow,ncol,grid,vis,n,m);
            }
        }
    }
    int numIslands(vector<vector<char>>& grid) {
        int m = grid.size();
        int n = grid[0].size();
        vector<vector<int>> vis(m,vector<int>(n,0));
        int ans=0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(!vis[i][j] && grid[i][j]=='1') {
                    dfs(i,j,grid,vis,n,m);
                    ans++;
                }
            }
        }
        return ans;
    }
};