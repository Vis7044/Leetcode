class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length,m=image[0].length;
        boolean [][]visited = new boolean[n][m];

        dfs(sr,sc,color,image,visited,n,m,image[sr][sc]);
        return image;
    }
    public void dfs(int sr,int sc,int color,int[][] image, boolean [][]visited, int n, int m,int intialColor) {
        if(sr<0 || sc<0 || sr>=n || sc>=m || visited[sr][sc] || image[sr][sc] != intialColor) return;
        visited[sr][sc] = true;
        image[sr][sc] = color;
        dfs(sr+1,sc,color,image,visited,n,m,intialColor);
        dfs(sr-1,sc,color,image,visited,n,m,intialColor);
        dfs(sr,sc+1,color,image,visited,n,m,intialColor);
        dfs(sr,sc-1,color,image,visited,n,m,intialColor);
    }
}