class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length(),m=t.length();
        if(n!=m) return false;
        int []arr = new int[26];
        Arrays.fill(arr,0);
        for(char c: s.toCharArray()) {
            arr[c-'a']++;
        }
        for(char c: t.toCharArray()) {
            arr[c-'a']--;
        }
        
        for(int a: arr) {
            if(a!=0) return false;
        }
        return true;
    }
}