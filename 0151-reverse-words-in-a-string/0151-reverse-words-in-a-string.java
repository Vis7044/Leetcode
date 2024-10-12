class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length()-1;
        while(i>=0) {
            StringBuilder ssb = new StringBuilder();
            while(i>=0 && s.charAt(i)==' ') i--;
            while(i>=0 && s.charAt(i)!=' ') {
                ssb.append(s.charAt(i));
                i--;
            }
            if(ssb.length()>0) {
                if(sb.length()==0) sb.append(ssb.reverse().toString());
                else sb.append(" "+ ssb.reverse().toString());
            }
        }
        return sb.toString();
    }
}