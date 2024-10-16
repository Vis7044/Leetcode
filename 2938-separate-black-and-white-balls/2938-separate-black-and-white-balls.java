class Solution {
    public long minimumSteps(String s) {
        long total1 = 0;
        long ans = 0;
        
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='1') total1++;
            else {
                ans += total1;
            }
        }
        return ans;
    }
}