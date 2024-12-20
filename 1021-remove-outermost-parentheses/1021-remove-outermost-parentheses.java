class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()) {
            if(c=='('){
                count++;
                if(count>1) sb.append(c);
            }
            else{
                count--;
                if(count>0) sb.append(c);
            }
           
        }
        return sb.toString();
    }
}