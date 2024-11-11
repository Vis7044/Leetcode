class Solution {
    public void bits_update(int arr[],int num,int diff) {
        for(int i=0;i<32;i++) {
            if((num &(1<<i))!=0) arr[i]+=diff;
        }
    }
    
    public int bits_to_num(int arr[]) {
        int res=0;
        for(int i=0;i<32;i++) {
            if(arr[i]>0) {
                res+=(1<<i);
            }
        }
        return res;
    }
    public int minimumSubarrayLength(int[] nums, int k) {
        int i=0,n=nums.length,ans=Integer.MAX_VALUE;
        int bits[] = new int[32];
        Arrays.fill(bits,0);
        for(int j=0;j<n;j++) {
            bits_update(bits,nums[j],1);
            int curr_or = bits_to_num(bits);
            while(curr_or>=k && i<=j) {
                ans=Math.min(ans,j-i+1);
                bits_update(bits,nums[i],-1);
                curr_or = bits_to_num(bits);
                i++;
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}