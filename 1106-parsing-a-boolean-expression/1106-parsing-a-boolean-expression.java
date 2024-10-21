class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> st = new Stack<>();
        
        
        for(char curr: expression.toCharArray()) {
            if(curr == ',' || curr == '(') continue;
            
            if(
                curr=='t' ||
                curr=='f' ||
                curr=='!' ||
                curr=='&' ||
                curr=='|'
            ) {
                st.push(curr);
            }else{
                boolean hasTrue = false, hasFalse = false;
                while(st.peek() != '|' && st.peek() != '!' 
                      && st.peek() != '&') {
                    char top = st.pop();
                    if(top == 't') hasTrue = true;
                    if(top == 'f') hasFalse = true;
                }
                char op = st.pop();
                if(op == '!') {
                    st.push(hasTrue?'f':'t');
                }else if(op=='&') {
                    st.push(hasFalse?'f':'t');
                }else {
                    st.push(hasTrue?'t':'f');
                }
            }
            
        }
        return st.peek()=='t';
    }
}