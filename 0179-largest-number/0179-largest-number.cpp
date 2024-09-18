class Solution {
public:
    string largestNumber(vector<int>& nums) {
        vector<string>st;
        for(auto it: nums) {
            st.push_back(to_string(it));
        }
        
        sort(st.begin(),st.end(),[](string &a, string &b) {
            return a+b>b+a;
        });
        
        if(st[0]=="0") return "0";
        string ans;
        for(auto it: st) {
            ans+=it;
        }
        return ans;
    }
};