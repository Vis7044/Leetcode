class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int cnt=0,majority;
        for(int i=0;i<nums.size();i++) {
            if(cnt==0) {
                majority=nums[i];
                cnt=1;
            }else {
                if(majority==nums[i]) {
                    cnt++;
                }else {
                    cnt--;
                }
            }
        }
        return majority;
    }
};