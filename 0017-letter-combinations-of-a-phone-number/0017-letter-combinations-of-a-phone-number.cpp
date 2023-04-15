class Solution {
public:
    void solve(int index,vector<string>&ans,string s,string mapping[],string digits){
        if(index>=digits.length()){
            ans.push_back(s);
            return;
        }
        int number = digits[index]-'0';
        string value = mapping[number];
        for(int i=0;i<value.length();i++){
            s.push_back(value[i]);
            solve(index+1,ans,s,mapping,digits);
            s.pop_back();
        }
    }
    vector<string> letterCombinations(string digits) {
        vector<string>ans;
        if(digits.length()==0) return ans;
        string s="";
        string mapping[10] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(0,ans,s,mapping,digits);
        return ans;
    }
};