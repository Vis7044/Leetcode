class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int s = nums.length;
        List<Integer> ls = new ArrayList<>();
        if(s==0) return ls;
        int cand1 =0, cand2=0;
        int count1=0,count2=0;
        
        for(int n: nums) {
            if(n==cand1) {
                count1++;
            }else if(n==cand2) {
                count2++;
            }else if(count1==0) {
                cand1=n;
                count1=1;
            }else if(count2==0) {
                cand2=n;
                count2=1;
            }else {
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;
        for(int n : nums) {
            if(n==cand1) count1++;
            if(n==cand2) count2++;
        }
        if(count1>s/3) ls.add(cand1);
        if(cand2 != cand1 && count2>s/3) ls.add(cand2);
        return ls;
    }
}