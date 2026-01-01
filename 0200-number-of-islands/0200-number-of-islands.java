class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length,m=grid[0].length;
        boolean [][] visited = new boolean[n][m];
        int islands = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(!visited[i][j] && grid[i][j]=='1') {
                    dfs(i,j,grid,visited);
                    islands++;
                }
            }
        }
        return islands;
    }

    public void dfs(int r,int c, char[][] grid, boolean[][] visited) {
        int n = grid.length;
        int m = grid[0].length;

        if(r<0 || c<0 || r>=n || c >= m || grid[r][c] == '0' || visited[r][c]) {
            return;
        }
        visited[r][c] = true;
        dfs(r-1,c,grid,visited);
        dfs(r+1,c,grid,visited);
        dfs(r,c-1,grid,visited);
        dfs(r,c+1,grid,visited);
    }
}