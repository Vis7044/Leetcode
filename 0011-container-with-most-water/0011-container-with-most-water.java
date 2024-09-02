class Solution {
    public int maxArea(int[] height) {
        int l=0,h=height.length-1;
        int ans=0;
        while(l<h) {
            if(height[l]<height[h]) {
                ans=Math.max(ans,height[l]*(h-l));
                l++;
            }else {
                 ans=Math.max(ans,height[h]*(h-l));
                h--;
            }
        }
        return ans;
        
    }
}