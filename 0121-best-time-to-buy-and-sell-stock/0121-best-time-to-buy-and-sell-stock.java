class Solution {
    public int maxProfit(int[] prices) {
        int maxi=prices[prices.length-1];
        int ans=0;
        
        for(int i=prices.length-2;i>=0;i--) {
            if(prices[i]<=maxi) {
                ans=Math.max(ans,maxi-prices[i]);
            }
            maxi = Math.max(maxi,prices[i]);
        }
        return ans;
    }
}