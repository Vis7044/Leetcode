class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
         unordered_map<int,int>mp;
        for(int i=0;i<ransomNote.size();i++){
            mp[ransomNote[i]]++;
        }
        for(int j=0;j<magazine.size();j++){
            if(mp.find(magazine[j]) != mp.end()) mp[magazine[j]]--;
        }
        for(auto i: mp){
            if(i.second>0) return false;
        }
        return true;
    }
};