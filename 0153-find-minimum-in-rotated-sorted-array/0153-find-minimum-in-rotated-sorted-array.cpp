class Solution {
public:
    int findMin(vector<int>& nums) {
        int l=0,h=nums.size()-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]>=nums[0] && nums[0]>nums[nums.size()-1]) l=mid+1;
            else h=mid-1;
        }
        return nums[l];
    }
};