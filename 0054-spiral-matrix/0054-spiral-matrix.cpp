class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int row = matrix.size();
        int col = matrix[0].size();

        int strow=0,stcol=0,endrow=row-1,endcol=col-1;
        int count=0;
        int total = row*col;
        vector<int>v;

        while(count<total){
            for(int i=stcol;count<total &&i<=endcol;i++){
                v.push_back(matrix[strow][i]);
                count++;
            }
            strow++;
            for(int i=strow;count<total &&i<=endrow;i++){
                v.push_back(matrix[i][endcol]);
                count++;
            }
            endcol--;
            for(int i=endcol;count<total &&i>=stcol;i--){
                v.push_back(matrix[endrow][i]);
                count++;
            }
            endrow--;
            for(int i=endrow;count<total &&i>=strow;i--){
                v.push_back(matrix[i][stcol]);
                count++;
            }
            stcol++;
        }
        return v;
    }
};