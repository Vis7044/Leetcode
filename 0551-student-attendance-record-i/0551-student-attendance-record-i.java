class Solution {
    public boolean checkRecord(String s) {
        boolean late= s.contains("LLL");
        int cnt=0;
        for(char c: s.toCharArray()) {
            if(c=='A') cnt++;
        }
        if(cnt>=2 || late) return false;
        return true;
    }
}