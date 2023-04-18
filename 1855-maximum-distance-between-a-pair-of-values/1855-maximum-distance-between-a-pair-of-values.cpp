class Solution {
public:
    int maxDistance(vector<int>& nums1, vector<int>& nums2) {
        int ans=0;
        for(int i=0;i<nums1.size();i++){
            int l=0,h=nums2.size()-1;
            while(l<=h){
                int mid = l+(h-l)/2;
                if(nums1[i]>nums2[mid]) h=mid-1;
                else{
                    if(i<mid && (mid-i)>ans)
                    {
                        ans=mid-i;
                    }
                    l=mid+1;
                }
            }
            
        }
        return ans;
    }
};