class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int suffMax[] = new int[n];
        suffMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--) {
            suffMax[i] = Math.max(suffMax[i+1],height[i]);
        }
        
        int prevMax = Integer.MIN_VALUE;
        int total = 0;
        for(int i=0;i<n;i++) {
            prevMax = Math.max(prevMax, height[i]);
            int afterMax = suffMax[i];
            if(prevMax > height[i] && afterMax > height[i]) {
                total+=Math.min(prevMax,afterMax)-height[i];
            }
        }
        return total;
    }
}