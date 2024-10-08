class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
        int l=0,h=n-1;
        while(l<=h) {
            int mid = l+(h-l)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]>=arr[l]) {
                if(target>=arr[l] && target<=arr[mid]) h=mid-1;
                else l=mid+1;
            }else {
                if(target>=arr[mid] && target<=arr[h]) l=mid+1;
                else h=mid-1;
            }
        }
        return -1;
    }
}