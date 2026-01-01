class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean visited[][] = new boolean[n][m];
        int maxi=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j]==1 && !visited[i][j]) {
                    maxi = Math.max(maxi,dfs(i, j, grid, visited,n,m));
                }
            }
        }
        return maxi;
    }

    public int dfs(int row, int col, int[][] grid, boolean[][] visited,int n,int m) {
        if(row<0 || col<0 || row>=n || col>=m || grid[row][col] == 0 || visited[row][col]) return 0;
        visited[row][col]=true;
        int area = 1;
        area+=dfs(row+1,col,grid,visited,n,m);
        area+=dfs(row-1,col,grid,visited,n,m);
        area+=dfs(row,col+1,grid,visited,n,m);
        area+=dfs(row,col-1,grid,visited,n,m);
        return area;
    }
}