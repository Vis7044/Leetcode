class Solution {
    public String sortSentence(String s) {
        String word[] = s.split(" ");
        String result[] = new String[word.length];
        
        for(String w: word) {
            int index = w.charAt(w.length()-1) - '0'-1;
            result[index] = w.substring(0,w.length()-1);
        }
        return String.join(" ",result);
    }
}