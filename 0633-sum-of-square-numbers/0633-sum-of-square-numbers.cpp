class Solution {
public:
    bool judgeSquareSum(int c) {
        int l=0,h=sqrt(c);
        while(l<=h){
            if((long long)pow(l,2)+(long long)pow(h,2)==c) return true;
            else if((long long)pow(l,2)+(long long)pow(h,2)>c) h--;
            else l++;
        }
        return false;
    }
};