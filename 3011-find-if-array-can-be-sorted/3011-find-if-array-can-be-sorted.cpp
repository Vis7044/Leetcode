class Solution {
public:
    bool canSortArray(vector<int>& nums) {
        int setbit = __builtin_popcount(nums[0]);
        int maxofsegment = nums[0];
        int minofsegment = nums[0];
        
        int maxofprevious = INT_MIN;
        
        for(int i=0;i<nums.size();i++) {
            if(__builtin_popcount(nums[i]) == setbit) {
                maxofsegment = max(maxofsegment, nums[i]);
                minofsegment = min(minofsegment, nums[i]);
            }else {
                if(maxofprevious>minofsegment) {
                    return false;
                }
                
                maxofprevious = maxofsegment;
                
                maxofsegment = nums[i];
                minofsegment = nums[i];
                setbit = __builtin_popcount(nums[i]);
            }
            
        }
        
        if(maxofprevious>minofsegment) return false;
        return true;
    }
};