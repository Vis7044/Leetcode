class Solution {
    public boolean checkPrime(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean primeSubOperation(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            int sub;
            if(i==0) {
                sub=nums[i];
            }else {
                sub = nums[i]-nums[i-1];
            }
            if(sub<=0) return false;
            
            int p=0;
            for(int j=sub-1;j>=2;j--) {
                if(checkPrime(j)) {
                    p=j;
                    break;
                }
            }
            nums[i] = nums[i]-p;
        }
        return true;
    }
}