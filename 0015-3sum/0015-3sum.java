class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-2;i++) {
            int l=i+1,h=n-1;
            int temp=nums[i];
            while(l<h) {
                int sum=temp+nums[l]+nums[h];
                if(sum==0) {
                    st.add(Arrays.asList(temp,nums[l],nums[h]));
                    l++;
                    h--;
                }else if(sum>0) h--;
                else l++;
            }
        }
        return new ArrayList<>(st);
    }
}