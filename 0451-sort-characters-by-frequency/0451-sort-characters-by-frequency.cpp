class Solution {
public:
    string frequencySort(string s) {
        map<char,int>mp;
        for(int i=0;i<s.length();i++) {
            mp[s[i]]++;
        }
        priority_queue<pair<int,char>>pq;
        for(auto it: mp) {
            pq.push({it.second,it.first});
        }
        string ans = "";
        
        while(!pq.empty()) {
            int num = pq.top().first;
            char c = pq.top().second;
            pq.pop();
            while(num!=0) {
                ans+=c;
                num--;
            }
        }
        return ans;
        
    }
};