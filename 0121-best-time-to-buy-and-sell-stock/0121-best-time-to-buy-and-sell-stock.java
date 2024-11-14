class Solution {
    public int maxProfit(int[] prices) {
        int maxi=0,mini=prices[0];
        for(int i=1;i<prices.length;i++) {
            maxi = Math.max(maxi,prices[i]-mini);
            mini = Math.min(mini,prices[i]);
        }
        return maxi;
    }
}