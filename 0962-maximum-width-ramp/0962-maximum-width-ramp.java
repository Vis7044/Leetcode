class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int maxi=-1;
        for(int i=n-1;i>=0;i--) {
            maxi = Math.max(maxi,nums[i]);
            arr[i] = maxi;
        }
        
        int ans=0,i=0,j=1;
        while(j<n) {
            while(nums[i]>arr[j]) i++;
            ans = Math.max(ans, j-i);
            j++;
        }
        return ans;
        
    }
}