class Solution {
public:
    string removeStars(string s) {
        int i=s.length()-1,k=0;
        string v="";
        while(i>=0){
            if(s[i]=='*'){
                k--;
            }else{
                if(k==0) v+=s[i];
                else k++;
            }
            i--;
        }
        reverse(v.begin(),v.end());
        return v;
    }
};