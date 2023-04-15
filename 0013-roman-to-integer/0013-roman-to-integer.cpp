class Solution {
public:
    int romanToInt(string s) {
        map<char,int> mp = {
            {'I',1},
            {'V',5},
            {'X',10},
            {'L',50},
            {'C',100},
            {'D',500},
            {'M',1000},
        };
        
        int sum=0;
        for(int i=0;i<s.size();i++)
        {
            auto it=mp.find(s[i]);
            auto It=mp.find(s[i+1]);
            if(it->second<It->second){
                sum+=(It->second-it->second);
                i++;
            }else
                sum+=it->second;
        }
        return sum;
    }
};