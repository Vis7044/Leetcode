class Solution {
public:
    int longestCommonPrefix(vector<int>& arr1, vector<int>& arr2) {
        unordered_set<string>st;
        for(auto it: arr1) {
            string s = to_string(it);
            for(int i=1;i<=s.length();i++) {
                st.insert(s.substr(0,i));
            }
        }
        int maxi=0;
        for(auto it: arr2) {
            string s = to_string(it);
            for(int i=1;i<=s.length();i++) {
                if(st.find(s.substr(0,i)) != st.end()) {
                    maxi=max(maxi,i);
                }
            }
            
        }
        return maxi;
    }
};