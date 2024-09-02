class Solution {
public:
    vector<int> countBits(int n) {
        vector<int>ans;
        for(int i=0;i<=n;i++) {
            int c=i,cnt=0;
            while(c!=0) {
                int temp = c&1;
                if(temp) cnt++;
                c=c>>1;
            }
            ans.push_back(cnt);
        }
        return ans;
    }
};