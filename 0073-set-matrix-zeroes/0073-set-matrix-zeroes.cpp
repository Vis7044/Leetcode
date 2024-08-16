class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int n=matrix.size(),m=matrix[0].size();
        vector<vector<int>>mat(n,vector<int>(m,-1));
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(matrix[i][j]==0) {
                    for(int k=0;k<m;k++) {
                        mat[i][k]=0;
                    }
                    for(int k=0;k<n;k++){
                        mat[k][j]=0;
                    }
                }
            }
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(mat[i][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
    }
};