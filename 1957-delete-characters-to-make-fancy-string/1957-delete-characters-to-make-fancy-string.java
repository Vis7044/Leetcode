class Solution {
    public String makeFancyString(String s) {
        if(s.length()<3) return s;
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        sb.append(s.charAt(1));
        for(int i=2;i<s.length();i++) {
            char c = s.charAt(i);
            char pre = s.charAt(i-1);
            char pre2 = s.charAt(i-2);
            if(c==pre && c==pre2) {
                continue;
            }else sb.append(c);
        }
        return sb.toString();
    }
}