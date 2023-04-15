class Solution {
public:
    int compress(vector<char>& chars) {
        int count = 1;
        string s="";
        for(int i=0;i<chars.size()-1;i++){
            if(chars[i]!=chars[i+1]){
                s+=chars[i];
                if(count!=1){
                    s+=to_string(count);
                }
                count=1;
                continue;
            }
            count++;
        }
        s+=chars[chars.size()-1];
        if(count!=1){
            s+=to_string(count);
        }
        for(int i=0;i<s.length();i++){
            chars[i]=s[i];
        }
        return s.length();
    }
};