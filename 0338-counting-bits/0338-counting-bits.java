class Solution {
    public int[] countBits(int n) {
        int a[] = new int[n+1];
        for(int i=0;i<=n;i++) {
            int c = i,cnt=0;
            while(c!=0) {
                int temp = c&1;
                if(temp==1) cnt++;
                c=c>>1;
            }
            a[i]=cnt;
        }
        return a;
    }
}