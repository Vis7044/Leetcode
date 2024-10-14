class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==')') {
                ans = Math.max(ans,st.size());
                st.pop();
            }else if(s.charAt(i)=='(') st.push(s.charAt(i));
        }
        return ans;
    }
}