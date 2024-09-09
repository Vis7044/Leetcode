class Solution {
    public int[] diStringMatch(String s) {
        int i=0,d=s.length();
        int arr[] = new int[s.length()+1];
        for(int j=0;j<s.length();j++) {
            if(s.charAt(j)=='I') {
                arr[j]=i++;
            }else arr[j]=d--;
        }
        if(s.charAt(s.length()-1)=='D') {
            arr[s.length()]=d;
        }else {
            arr[s.length()]=i;
        }
        return arr;
    }
}