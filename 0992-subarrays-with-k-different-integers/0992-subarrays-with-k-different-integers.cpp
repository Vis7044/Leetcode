class Solution {
public:
    int solve(vector<int>& nums, int k) {
        if(k<0) return 0;
        int i=0,j=0,cnt=0;
        map<int,int>mp;
        while(j<nums.size()) {
            mp[nums[j]]++;
            while(mp.size()>k) {
                mp[nums[i]]--;
                if(mp[nums[i]]==0) mp.erase(nums[i]);
                i++;
                  
            }
            cnt+=j-i+1; 
            
            j++;
        }
        return cnt;
    }
    int subarraysWithKDistinct(vector<int>& nums, int k) {
        return solve(nums,k)-solve(nums,k-1);
    }
};