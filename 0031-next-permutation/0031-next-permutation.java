class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length,i;
        for(i=n-2;i>=0;i--) {
            if(nums[i]<nums[i+1]) break;
        }
        if(i>=0) {
            int j = n-1;
            while(nums[j]<=nums[i]) j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }
    public void swap(int a[],int i,int j) {
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public void reverse(int a[],int l,int h) {
        while(l<h) swap(a,l++,h--);
    }
}