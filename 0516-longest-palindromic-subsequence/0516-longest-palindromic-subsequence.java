class Solution {
    public String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        String s2 = reverse(s);
        
        int dp[][] = new int[n+1][n+1];
        for(int arr[]:dp) {
            Arrays.fill(arr,0);
        }
        
        for(int i=0,j=0;i<n;i++) {
            dp[i][0]=0;
            dp[0][j]=0;
        }
        
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if(s.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
//         StringBuilder ans = new StringBuilder();
        
//         int i=n,j=n;
//         while(j>0 && i>0)
//             if(s.charAt(i)==s2.charAt(j)) {
//                 ans.append(s.charAt(i-1));
//                 i--;
//                 j--;
//             }else{
//                 if(dp[i-1][j]>dp[i][j-1]) i--;
//                 else j--;
//             }
//         }
//         return ans.toString();
        
        return dp[n][n];
    }
}