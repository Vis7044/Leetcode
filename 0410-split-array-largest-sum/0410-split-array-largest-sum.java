class Solution {
    public int splitArray(int[] nums, int k) {
        int l=0,h=0;
        for(int n: nums) {
            l = Math.max(l,n);
            h+=n;
        }
        int ans=h;
        while(l<=h) {
            int mid = l + (h-l)/2;
            if(canPlace(nums,mid,k)) {
                ans=mid;
                 h=mid-1;
            }else {
               l=mid+1;
            }
        }
        return ans;
    }

    public boolean canPlace(int nums[], int mid, int k) {
        int count = 1;
        int currSum = 0;
        for(int n: nums) {
            if(currSum+n <= mid) {
                currSum+=n;
            }else {
                currSum=n;
                count++;
                if(count>k) return false;
            }
        }
        return true;
    }
}