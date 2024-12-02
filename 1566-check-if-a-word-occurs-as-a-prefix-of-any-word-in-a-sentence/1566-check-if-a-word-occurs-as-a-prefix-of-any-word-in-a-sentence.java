class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String arr[] = sentence.split("\s");

        int ans=-1;
        
        for(int i=0;i<arr.length;i++) {
            boolean flag = true;
            String sn = arr[i];
            if(searchWord.length()<=sn.length()) {
                for(int j=0;j<searchWord.length();j++) {
                    if(sn.charAt(j)!=searchWord.charAt(j)) {
                        flag=false;
                        break;
                    }
                }
                if(flag) return i+1;
            }
        }
        return ans;
    }
}