class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        if(s.length()!=goal.length()) return false;
        if(n==0) return true;
        String s1 = s + s;
        if(s1.contains(goal)) return true;
        return false;
    }
}