class Solution {
public:
    bool halvesAreAlike(string s) {
        int n = s.size();
        string vowel= "aeiouAEIOU";
        int first_half=0,second_half=0;
        for(int i=0,j=n-1;i<n/2;i++,j--)
        {
            if(vowel.find(s[i])<=vowel.size()){
                first_half++;
            }
            if(vowel.find(s[j])<=vowel.size()){
                second_half++;
            }
        }
        if(first_half==second_half) return true;
        else return false;
    }
};