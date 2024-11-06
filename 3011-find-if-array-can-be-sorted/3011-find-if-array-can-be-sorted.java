class Solution {
    public boolean canSortArray(int[] nums) {
        int setBit = Integer.bitCount(nums[0]);
        
        int maxofsegment = nums[0];
        int minofsegment = nums[0];
        
        int maxofprevious = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++) {
            if(Integer.bitCount(nums[i]) == setBit) {
                maxofsegment = Math.max(maxofsegment , nums[i]);
                minofsegment = Math.min(minofsegment, nums[i]);
            } else {
                if(maxofprevious > minofsegment) {
                    return false;
                }
                maxofprevious = maxofsegment;
                maxofsegment = nums[i];
                minofsegment = nums[i];
                setBit = Integer.bitCount(nums[i]);
            }
            
        }
        if(maxofprevious > minofsegment) {
                    return false;
                }
            return true;
    }
}