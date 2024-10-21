class Solution {
    public String revInv(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()) {
            sb.append(c=='0'?'1':'0');
        }
        return sb.reverse().toString();
        
    }
    
    public String solve(int n) {
        if(n==1) return "0";
        
        String s = solve(n-1);
        return s+"1"+revInv(s);
    }
    public char findKthBit(int n, int k) {
        return solve(n).charAt(k-1);   
    }
}