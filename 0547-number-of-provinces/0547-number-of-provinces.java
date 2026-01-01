class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean visited[] =new boolean[n];
        int provinces = 0;
        for(int i=0;i<n;i++) {
            if(!visited[i]) {
                dfs(i,isConnected,visited);
                provinces++;
            }
        }
        return provinces;
    }

    public void dfs(int start,int [][] isConnected, boolean[] visited) {
        visited[start] = true;
        for(int i=0;i<isConnected[start].length;i++) {
            if(isConnected[start][i] == 1 && !visited[i]){
                dfs(i,isConnected,visited);
            }
        }
    }
}