class Solution {
public:
    int solve(vector<int>&nums,long long sum) {
        int cnt=1;
        long long sSum=0;
        for(int i=0;i<nums.size();i++) {
            if(sSum+nums[i]>sum) {
                sSum=nums[i];
                cnt++;
            }else {
                sSum+=nums[i];
            }
        }
        return cnt;
    }
    int splitArray(vector<int>& nums, int k) {
        if(k>nums.size()) return -1;
        int l = *max_element(nums.begin(),nums.end());
        long long h = accumulate(nums.begin(),nums.end(),0);
        while(l<=h) {
            int mid = l+(h-l)/2;
            int div = solve(nums,mid);
            if(div>k) l=mid+1;
            else h=mid-1;
        }
        return l;
    }
};