class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return solve(nums,upper+1) - solve(nums,lower);
    }
    public long solve(int nums[],int val) {
        long count=0;
        int low=0,high= nums.length-1;
        while(low<=high) {
            int sum = nums[low]+nums[high];
            if(sum<val) {
                count+=high-low;
                low++;
            }else {
                high--;
            }
        }
        return count;
    }
}