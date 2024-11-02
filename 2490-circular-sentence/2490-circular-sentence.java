class Solution {
    public boolean isCircularSentence(String sentence) {
        if(sentence.charAt(0)!=sentence.charAt(sentence.length()-1)) return false;
        String s[] = sentence.split("\\s");
        
        int n = s.length;
        for(int i=1;i<n;i++) {
            int x = s[i-1].length();
            if(s[i-1].charAt(x-1)!=s[i].charAt(0)) return false;
        }
        return true;
    }
}