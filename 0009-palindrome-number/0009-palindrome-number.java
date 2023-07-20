class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
            if(s.charAt(i)!=s.charAt(j)) return false;
        }
        return true;
        
    }
}