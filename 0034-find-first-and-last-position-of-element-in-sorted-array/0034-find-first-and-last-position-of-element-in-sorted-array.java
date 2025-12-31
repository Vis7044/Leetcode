class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = solveLeft(nums,target);
        int right = solveRight(nums,target);
        return new int[]{left,right};
    }

    public int solveLeft(int []nums,int target) {
        int l=0,h=nums.length-1;
        int ans=-1;
        while(l<=h) {
            int mid = l+(h-l)/2;
            if(nums[mid] == target) {
                ans=mid;
                h=mid-1;
            }else if(nums[mid]<target) {
                l = mid+1;
            }else {
                h=mid-1;
            }
        }
        return ans;
    }

    public int solveRight(int []nums,int target) {
        int l=0,h=nums.length-1;
        int ans=-1;
        while(l<=h) {
            int mid = l+(h-l)/2;
            if(nums[mid] == target) {
                ans=mid;
                l=mid+1;
            }else if(nums[mid]<target) {
                l = mid+1;
            }else {
                h=mid-1;
            }
        }
        return ans;
    }
}