class Solution {
    public int majorityElement(int[] nums) {
        int ans=nums[0],count=1;
        for(int i=1;i<nums.length;i++) {
            if(count==0) {
                count++;
                ans=nums[i];
                continue;
            }
            if(ans==nums[i]) {
                count++;
            }else {
                count--;
            }
        }
        return ans;
    }
}