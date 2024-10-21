class Solution {
    public int maxUniqueSplit(String s) {
        Set<String> seen = new HashSet<>();
        return backtrack(s,0,seen);
    }
    public int backtrack(String s, int start, Set<String> seen) {
        if(start == s.length()) return 0;
        
        
        int max_count =0;
        for(int end = start+1;end<=s.length();end++) {
            String subs = s.substring(start,end);
            if(!seen.contains(subs)) {
                seen.add(subs);
                max_count = Math.max(max_count, 1 + backtrack(s,end,seen));
                seen.remove(subs);
            }
        }
        return max_count;
    }
}