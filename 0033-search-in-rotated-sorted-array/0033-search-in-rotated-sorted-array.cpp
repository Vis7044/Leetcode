class Solution {
public:
    int pivot(vector<int>&nums){
       int l=0,h=nums.size()-1;
        while(l<h){
            int mid=l+(h-l)/2;
            if(nums[mid]>=nums[0]){
                l=mid+1;
            }
            else{
                h=mid;
            }
        }
        return l;
    }
    int binarys(vector<int>&nums,int l,int h,int target){
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    }
   
    int search(vector<int>& nums, int target) {
        int piv=pivot(nums);
        cout<<piv<<endl;
        if(target>=nums[piv] && target<=nums[nums.size()-1]) return binarys(nums,piv,nums.size()-1,target);
        else return binarys(nums,0,piv-1,target);
    }



};