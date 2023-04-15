class Solution {
public:
    long long zeroFilledSubarray(vector<int>& nums) {
           long long ans=0,k=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]!=0){
                while(k!=0){
                    ans+=k;
                    k--;
                }
            }else{
                k++;
            }
        }
        while(k!=0) ans+=k--;
        return ans;
    }
};