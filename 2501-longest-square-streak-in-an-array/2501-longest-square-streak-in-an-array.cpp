class Solution {
public:
    int longestSquareStreak(vector<int>& nums) {
        int longestStreak = 0;
        
        unordered_set<int> st(nums.begin(),nums.end());
        
        for(int startNums : nums) {
            int currentStreak =0;
            long long current = startNums;
            
            while(st.find((int)current)  != st.end()) {
                currentStreak++;
                if(current*current >1e5) break;
                current*=current;
            }
            
            longestStreak = max(longestStreak,currentStreak);
        }
        
        return longestStreak<2?-1: longestStreak;
    }
};