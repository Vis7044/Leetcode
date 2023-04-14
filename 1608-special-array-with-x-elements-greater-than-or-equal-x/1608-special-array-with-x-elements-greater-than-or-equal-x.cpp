class Solution {
public:
    int specialArray(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int l = 0;
        int h = nums[nums.size()-1];
        int ctr=0;
        while(l<=h){
            ctr=0;
            int mid = l+(h-l)/2;
        
            for(int i=0; i<nums.size(); i++){
                if(nums[i]>=mid){
                    ctr++;
                }
            }
            if(ctr==mid){
                return mid;
            }
            if(ctr<mid){
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }

        return -1;
    }
};