class Solution {
    public int longestStrChain(String[] words) {
        
        Arrays.sort(words,(a,b)-> Integer.compare(a.length(),b.length()));
        int n = words.length;

        int dp[] = new int[n];
        Arrays.fill(dp,1);
        int max=1;
        for(int i=1;i<n;i++) {
            for(int j=0;j<i;j++) {
                if(check(words[i],words[j]) && dp[j]+1>dp[i]) {
                    dp[i] = dp[j]+1;
                }
            }
            if(dp[i]>max) max=dp[i];
        }
        return max;
    }

    public boolean check(String w1,String w2) {
        if(w1.length() != w2.length()+1) return false;
        int i=0,j=0;

        while(i<w1.length()) {
            if(j<w2.length() && w1.charAt(i)==w2.charAt(j)) {
                i++;
                j++;
            }else i++;
        }

        if(i==w1.length() && j==w2.length() ) return true;
        return false;

    }
}