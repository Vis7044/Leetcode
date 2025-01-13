class Solution {
    public int minimumLength(String s) {
        Map<Character,Integer> mp = new HashMap<>();

       
        for(char c: s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c,0)+1);
        }
        int deleted=0;
        for(int val: mp.values()) {
            if(val%2==0) {
                deleted+=val-2;
            }else deleted+=val-1;
        }
        return s.length()-deleted;
    }
}