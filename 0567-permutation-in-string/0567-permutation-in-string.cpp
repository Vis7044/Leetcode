class Solution {
private:
    bool isequal(int a[],int b[]){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
public:
    bool checkInclusion(string s1, string s2) {
        int count1[26] = {0};
        for(int i=0;i<s1.length();i++){
            count1[s1[i]-'a']++;
        }

        int count2[26]={0};
        int i=0;
        while(i<s1.length() && i<s2.length()){
            count2[s2[i]-'a']++;
            i++;
        }

        if(isequal(count1,count2)) return true;
        while(i<s2.length()){
            count2[s2[i]-'a']++;
            count2[s2[i-s1.length()]-'a']--;
            i++;
            if(isequal(count1,count2)) return true;
        }
        return false;
    }
};