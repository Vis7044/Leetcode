class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n<3) return false;
        int i=1;
        while(i<n) {
            if(arr[i]==arr[i-1]) return false;
            if(arr[i]<arr[i-1]) break;
            i++;
        }
        if(i==n || i==1) return false;
        while(i<n) {
            if(arr[i]==arr[i-1]) return false;
            if(arr[i]>arr[i-1]) break;
            i++;
        }
        if(i!=n) return false;
        return true;
    }
}