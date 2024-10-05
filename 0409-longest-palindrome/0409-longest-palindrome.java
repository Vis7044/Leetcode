class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> mp =new HashMap<>();
        
        for(char c: s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c,0)+1);
        }
        int odd=0,ans=0;
        for(int value: mp.values()) {
            if(value%2!=0) {
                if(odd==0) {
                    ans+=value;
                    odd=1;
                }
                else ans+=value-1;
            }else ans+=value;
        }
        return ans;
    }
}