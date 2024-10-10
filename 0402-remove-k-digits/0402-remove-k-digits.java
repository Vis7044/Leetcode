class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k) return "0";
        Stack<Character> st = new Stack<>();
        for(char c: num.toCharArray()) {
            while(!st.isEmpty() && st.peek()> c && k>0) {
                st.pop();
                k--;
            }      
            st.push(c);
        }
       
        while(k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty()) return "0";
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        if(sb.length()==0) return "0";
        return sb.toString();
    }
}