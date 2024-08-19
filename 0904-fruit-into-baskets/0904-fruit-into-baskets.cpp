class Solution {
public:
    int totalFruit(vector<int>& fruits) {
        int i=0,r=0,maxi=0;
        map<int,int>mp;
        while(r<fruits.size()) {
            mp[fruits[r]]++;
            while(mp.size()>2) {
                mp[fruits[i]]--;
                if(mp[fruits[i]]==0) {
                    mp.erase(fruits[i]);
                }
                i++;
            }
            if(mp.size()<=2) {
                maxi=max(maxi,r-i+1);
                r++;
            }
        }
        return maxi;
            
    }
};