class Solution {
public:
    long long maximumSubarraySum(vector<int>& nums, int k) {
        int n = nums.size();
        long long sum=0,max_sum=0;
        unordered_set<int>st;
        int i=0,j=0;
        while(j<n) {
            sum+=nums[j];
            while(st.count(nums[j])) {
                sum-=nums[i];
                st.erase(nums[i]);
                i++;
            }
            st.insert(nums[j]);
            if(j-i+1==k) {
                max_sum = max(sum,max_sum);
                sum-=nums[i];
                st.erase(nums[i]);
                i++;
            }
            j++;

        }
        return max_sum;
        
    }
};