class Solution {
    public String compare(String p,String q){
        int n=p.length();
        int m=q.length();
        int i=0;
        String cm="";
        while(m>0 && n>0){
            if(p.charAt(i)!=q.charAt(i)) {
                return cm;
            }
            else{
                cm+=p.charAt(i);
                i++;
            }
            m--;
            n--;
        }
        return cm;
    }
    public String longestCommonPrefix(String[] strs) {
        // if(strs[0].charAt(0)!=strs[1].charAt(0)) return "";
        String s=strs[0];
        for(int i=1;i<strs.length;i++){
            s=compare(s,strs[i]);
        }
        return s;
        
    }
}