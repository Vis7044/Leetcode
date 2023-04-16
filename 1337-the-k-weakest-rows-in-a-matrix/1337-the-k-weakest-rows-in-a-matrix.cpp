class Solution {
public:
    vector<int> kWeakestRows(vector<vector<int>>& mat, int k) {
        int m=mat.size()-1;
        int n=mat[0].size()-1;
        vector<pair<int,int>>v;
        for(int i=0;i<=m;i++){
            int l=0,h=n;
            while(l<=h){
                int mid=l+(h-l)/2;
                if(mat[i][mid]==1) l=mid+1;
                else h=mid-1;
            }
            v.push_back({l,i});
        }
        sort(v.begin(),v.end());
        vector<int>ans;
        for(int i=0;i<v.size();i++){
            if(k==0) break;
            ans.push_back(v[i].second);
            k--;
        }
        return ans;
    }
};