class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int vis[][] = new int[n][m];
        Queue<int[]> q = new LinkedList<>();
        int cntFresh=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j]==2) {
                    q.offer(new int[]{i,j,0});
                    vis[i][j]=1;
                }else if(grid[i][j]==1) {
                    cntFresh++;
                }else {
                    vis[i][j]=0;
                }
            }
        }

        int delRow[] = new int[]{-1,0,+1,0};
        int delCol[] = new int[]{0,+1,0,-1};
        int tm = 0;

        while(!q.isEmpty()) {
            int row = q.peek()[0];
            int col = q.peek()[1];
            int t = q.peek()[2];
            q.poll();
            tm = Math.max(tm, t);
            for(int i=0;i<4;i++) {
                int nrow = row+delRow[i];
                int ncol = col+delCol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m
                 && grid[nrow][ncol]==1&&vis[nrow][ncol]==0) {
                    vis[nrow][ncol]=1;
                    cntFresh--;
                    grid[nrow][ncol]=2;
                    q.offer(new int[]{nrow,ncol,tm+1});
                 }
            }
        }

        if(cntFresh!=0) return -1;
        return tm;
    }
}