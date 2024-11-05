class Solution {
    public String compressedString(String word) {
        int n = word.length();
      
        StringBuilder sb = new StringBuilder();
        int max_count=1;
        for(int i=1;i<n;i++) {
            if(word.charAt(i)!=word.charAt(i-1)) {
                if(max_count/9!=0) {
                    int c = max_count/9;
                    int rem = max_count%9;
                    while(c!=0) {
                        sb.append(""+9+""+word.charAt(i-1));
                        c--;
                    }
                    if(rem!=0) {
                        sb.append(""+rem+""+word.charAt(i-1));
                    }
                }else {
                    sb.append(""+max_count+""+word.charAt(i-1));
                }
                max_count=1;
            }else max_count++;
        }
        
        if(max_count/9!=0) {
            int c = max_count/9;
            int rem = max_count%9;
            while(c!=0) {
                sb.append(""+9+""+word.charAt(n-1));
                c--;
            }
            if(rem!=0) {
                sb.append(""+rem+""+word.charAt(n-1));
            }
        }else {
            sb.append(""+max_count+""+word.charAt(n-1));
        }
        return sb.toString();
    }
}