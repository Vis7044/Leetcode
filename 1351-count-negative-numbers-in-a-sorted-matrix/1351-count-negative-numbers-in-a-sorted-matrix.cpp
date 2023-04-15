class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
        int m=grid.size(),count=0;
        for(int i=0;i<m;i++){
            int l=0,h=grid[i].size()-1;
            while(l<=h){
                int mid=l+(h-l)/2;
                if(grid[i][mid]<0) h=mid-1;
                else l=mid+1;
            }
            count+=(grid[i].size()-l);
        }
        return count;
    }
};