class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l =0,h=n-1;
        while(l<=h) {
            int mid = l+(h-l)/2;
            if(nums[mid]>=nums[0] && nums[mid]>nums[n-1]) l=mid+1;
            else h=mid-1;
        }
        return nums[l];
    }
}