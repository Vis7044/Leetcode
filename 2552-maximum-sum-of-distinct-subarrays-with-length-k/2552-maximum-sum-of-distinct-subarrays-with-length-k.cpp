class Solution {
public:
    long long maximumSubarraySum(vector<int>& nums, int k) {
        int n = nums.size();
        long long sum=0,max_sum=0;
        map<int,int>mp;
        int i=0,j=0;
        while(j<n) {
            sum+=nums[j];
            mp[nums[j]]++;
            while(mp[nums[j]]>1) {
                sum-=nums[i];
                mp[nums[i]]--;
                i++;
            }

            if(j-i+1==k) {
                max_sum = max(sum,max_sum);
                sum-=nums[i];
                mp[nums[i]]--;
                i++;
            }
            j++;

        }
        return max_sum;
        
    }
};