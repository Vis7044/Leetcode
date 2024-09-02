class Solution {
    public int hammingWeight(int n) {
       int a=0;
        while(n!=0) {
            int temp = n&1;
            if(temp==1) a++;
            n=n>>1;
        }
        return a;
    }
}