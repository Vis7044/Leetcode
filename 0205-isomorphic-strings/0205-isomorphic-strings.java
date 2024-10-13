class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length(), m= t.length();
        if(n!=m) return false;
        Map<Character, Character> mps = new HashMap<>();
        Map<Character, Character> mpt = new HashMap<>();
        for(int i=0;i<n;i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            if(mps.containsKey(charS)) {
                if(mps.get(charS)!=charT) return false;
            }else {
                mps.put(charS,charT);
            }
            
            if(mpt.containsKey(charT)) {
                if(mpt.get(charT)!=charS) return false;
            }else {
                mpt.put(charT, charS);
            }
        }
        return true;
    }
}