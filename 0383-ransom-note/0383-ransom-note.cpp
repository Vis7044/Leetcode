class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
         int mp[26]={0};
        for(int i=0;i<magazine.size();i++){
            mp[magazine[i]-'a']++;
        }
        for(int j=0;j<ransomNote.size();j++){
            if(--mp[ransomNote[j]-'a']<0)return false;
        }
       
        return true;
    }
};