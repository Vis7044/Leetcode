class Solution {
    public boolean detectCapitalUse(String word) {
        int upper = 0;
        int first=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                upper++;
            }
            if(Character.isUpperCase(word.charAt(0))){
                first=1;
            }
        }
        if(first==1 && upper==1) return true;
        else if(upper==word.length()) return true;
        else if(upper==0) return true;
        else return false;
    }
}