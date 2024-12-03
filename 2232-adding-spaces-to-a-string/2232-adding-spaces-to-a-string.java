class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();

        sb.append(s.substring(0,spaces[0]));
        int n = spaces.length;

        for(int i=1;i<n;i++) {
            sb.append(" "+s.substring(spaces[i-1],spaces[i]));
        }
        sb.append(" "+s.substring(spaces[n-1],s.length()));

        return sb.toString();
    }
}