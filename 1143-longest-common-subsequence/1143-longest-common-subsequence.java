class Solution {
    int solve(int ind1,int ind2, String t1,String t2,int dp[][]) {
        if(ind1<0 || ind2<0) { 
            return 0;
        }
        if(dp[ind1][ind2]!=-1) return dp[ind1][ind2];
        int take=0,ntake=0;
        if(t1.charAt(ind1)==t2.charAt(ind2)) 
            take= 1+ solve(ind1-1,ind2-1,t1,t2,dp);
        else
            ntake = Math.max(solve(ind1,ind2-1,t1,t2,dp) ,solve(ind1-1,ind2,t1,t2,dp));
        return dp[ind1][ind2] = take+ntake;
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length(),m=text2.length();
        int dp[][] = new int[n][m];
        for(int arr[]: dp) {
            Arrays.fill(arr,-1);
        }
        return solve(n-1,m-1,text1,text2,dp);
    }
}