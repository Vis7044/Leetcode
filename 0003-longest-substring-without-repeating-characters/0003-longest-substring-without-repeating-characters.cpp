class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        if(s=="") return 0;
        vector<int>mp(256,-1);
        int maxi=INT_MIN;
        int i=0,j=0;
        while(j<s.length()) {
            if(mp[s[j]]!=-1) {
                if(mp[s[j]]>=i) {
                    i=mp[s[j]]+1;
                }
            }
            mp[s[j]]=j;
            maxi=max(maxi,(j-i)+1);
            j++;
        }
        return maxi;
    }
};