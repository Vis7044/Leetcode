class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==2) {
            if(nums[0]%2==0 && nums[1]%2==0 ||  nums[0]%2!=0 && nums[1]%2!=0) return false;
            return true;
        }
        for(int i=1;i<nums.length;i++) {
            if((nums[i]%2==0 && nums[i-1]%2==0) ) return false;
            else if((nums[i]%2!=0 && nums[i-1]%2!= 0) ) return false;
        }
        return true;
    }
}