class Solution {
public:
    int findComplement(int num) {
        int ans=0;
        int i=0;
        
        while(num!=0) {
            int a= num & 1;
            if(a==0) {
                ans+=pow(2,i)*1;
            }
            i++;
            num=num>>1;
        }
        return ans;
    }
};