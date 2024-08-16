class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        int n = nums.size();
        if(n==0) return 0;
        set<int>s;
        for(int i=0;i<n;i++) {
            s.insert(nums[i]);
        }
        int maxi = INT_MIN;
        for(auto it: s) {
            if(s.find(it-1) == s.end()) {
                int cnt=1;
                int itr = it;
                while(s.find(itr+1)!=s.end()) {
                    itr++;
                    cnt++;
                }
                maxi=max(maxi,cnt);
            }
        }
        return maxi;
    }
};