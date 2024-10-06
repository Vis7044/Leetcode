class Solution {
    public String sortVowels(String s) {
        List<Character> ls = new ArrayList<>();
        for(char c: s.toCharArray()) {
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U' || c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                ls.add(c);  
            }
        }
        Collections.sort(ls);
        StringBuilder sb = new StringBuilder();
        int i=0;
        for(char c: s.toCharArray()) {
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U' || c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                sb.append(ls.get(i++));
            }else sb.append(c);
        }
        return sb.toString();
    }
}