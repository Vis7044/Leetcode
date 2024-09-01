class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        set<vector<int>>ans;
        int n = nums.size();
        sort(nums.begin(),nums.end());
        for(int i=0;i<n-2;i++) {
            int l=i+1,h=n-1;
            int el = nums[i];
            while(l<h) {
                int sum=el+nums[l]+nums[h];
                if(sum==0) {
                    ans.insert({el,nums[l],nums[h]});
                    l++;
                    h--;
                }else if(sum>0) {
                    h--;
                }else l++;
            }
        }
        vector<vector<int>>vc(ans.begin(),ans.end());
        return vc;
    }
};