class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> s = new HashSet<>();
        int longest = Integer.MIN_VALUE;
        for(int n :nums) s.add(n);

        for(int n: s) {
            if(!s.contains(n-1)){
                int start=n;
                int count=1;
                while(s.contains(start+1)){
                    count++;
                    start++;
                }
                longest = Math.max(longest, count);
            }

        }
        return longest;
    }
}