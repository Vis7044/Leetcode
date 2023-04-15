class Solution {
public:
    string common(string s,string r){
        int l = s.length();
        int q = r.length();
        int i=0;
        string p = "";
        while(l!=0 && q!=0){
            if(s[i]==r[i]){
                p+=s[i++];
            }
            l--;
            q--;
        }
        return p;
    }
    string longestCommonPrefix(vector<string>& strs) {
        string s = strs[0];
        for(int i=1;i<strs.size();i++){
            s = common(s,strs[i]);
        }
        return s;
    }
};