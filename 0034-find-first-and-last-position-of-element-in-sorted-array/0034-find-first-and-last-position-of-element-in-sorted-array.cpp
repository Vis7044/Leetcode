class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int>v(2,-1);
        int low=0,high=nums.size()-1;
        int ans=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                high=mid-1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(ans!=-1){
            v[0]=ans;
            int l=ans,h=nums.size()-1;
            while(l<=h){
                int m=l+(h-l)/2;
                if(nums[m]==target){
                    ans=m;
                    l=m+1;
                }else{
                    h=m-1;
                }
            }
            v[1]=ans;
        }
        return v;
    }
};