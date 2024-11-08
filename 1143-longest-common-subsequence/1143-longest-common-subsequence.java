class Solution {
    int solve(int ind1,int ind2, String t1,String t2,int dp[][]) {
        if(ind1==0 || ind2==0) { 
            return 0;
        }
        if(dp[ind1][ind2]!=-1) return dp[ind1][ind2];
        int take=0,ntake=0;
        if(t1.charAt(ind1-1)==t2.charAt(ind2-1)) 
            take= 1+ solve(ind1-1,ind2-1,t1,t2,dp);
        else
            ntake = Math.max(solve(ind1,ind2-1,t1,t2,dp) ,solve(ind1-1,ind2,t1,t2,dp));
        return dp[ind1][ind2] = take+ntake;
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length(),m=text2.length();
        int dp[][] = new int[n+1][m+1];
        for(int arr[]: dp) {
            Arrays.fill(arr,-1);
        }
        for(int i=0;i<=m;i++) {
            dp[0][i]=0;
        }
        for(int i=0;i<=n;i++) {
            dp[i][0]=0;
        }
        
        for(int ind1=1;ind1<=n;ind1++) {
            for(int ind2=1;ind2<=m;ind2++) {
                
                int take=0,ntake=0;
                if(text1.charAt(ind1-1)==text2.charAt(ind2-1)) 
                    take= 1+ dp[ind1-1][ind2-1];
                else
                    ntake = Math.max(dp[ind1][ind2-1] ,dp[ind1-1][ind2]);
                dp[ind1][ind2] = take+ntake;
                                     }
                                     }
                                     return dp[n][m];
        
                                     
    }
}