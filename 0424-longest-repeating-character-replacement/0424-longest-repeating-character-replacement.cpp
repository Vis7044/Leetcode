class Solution {
public:
    int characterReplacement(string s, int k) {
        int i=0,j=0,maxi=0,max_len=0;
        vector<int>arr(26,0);
        while(j<s.length()) {
            arr[s[j]-'A']++;
            maxi=max(maxi,arr[s[j]-'A']);
            int change = j-i+1-maxi;
            if(change<=k) {
                max_len=max(max_len,j-i+1);
            }else {
                arr[s[i]-'A']--;
                i++;
            }
            j++;
        }
        return max_len;
    }
};