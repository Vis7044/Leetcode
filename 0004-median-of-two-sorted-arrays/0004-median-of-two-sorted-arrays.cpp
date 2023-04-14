class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int total_size = nums1.size()+nums2.size();
        int arr[total_size];
        int i=0,j=0,k=0;
        while(i<nums1.size() && j<nums2.size()){
            if(nums1[i]>nums2[j]) arr[k++]=nums2[j++];
            else arr[k++] = nums1[i++];
        }
        while(i<nums1.size()) arr[k++] = nums1[i++];
        while(j<nums2.size()) arr[k++] = nums2[j++];
        cout<<k%2<<endl;
        if(k%2==0) return (arr[k/2] + arr[(k/2)-1])/2.0;
        else return arr[k/2];
    }
};