class Solution {
public:
    int lengthOfLastWord(string s) {
        int c = 0,x=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s[i]==' ') c++;
            else break;
        }
        for(int i=s.length()-c-1;i>=0;i--){
            if(s[i]==' ') break;
            else x++;
        }
        return x;
    }
};