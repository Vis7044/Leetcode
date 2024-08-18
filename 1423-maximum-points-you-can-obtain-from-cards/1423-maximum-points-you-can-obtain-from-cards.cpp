class Solution {
public:
    int maxScore(vector<int>& cardPoints, int k) {
        int l_sum=0,r_sum=0,max_sum=0;
        int l =0,r=cardPoints.size()-1;
        for(l=0;l<k;l++) {
            l_sum+=cardPoints[l];
        }
        max_sum=l_sum;
        l--;
        
        while(k!=0) {
            l_sum-=cardPoints[l--];
            r_sum+=cardPoints[r--];
            max_sum=max(max_sum,l_sum+r_sum);
            k--;
        }
        return max_sum;
    }
};