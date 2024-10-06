class Solution {
    public boolean checkIfPangram(String sentence) {
        int arr[] = new int[26];
        Arrays.fill(arr,0);
        for(char c: sentence.toCharArray()) {
            arr[c-'a'] = 1;
        }
        for(int a: arr) {
            if(a!=1) return false;
        }
        return true;
    }
}