class Solution {
    void solve(int ind,List<List<Integer>> ls,ArrayList<Integer> temp,int []nums) {
        
        ls.add(new ArrayList<>(temp));
        for(int i=ind;i<nums.length;i++) {
            if(i>ind && nums[i-1]==nums[i]) continue;
            temp.add(nums[i]);
            solve(i+1,ls,temp,nums);
            temp.remove(temp.size()-1);
        }
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(nums);
        solve(0,ls,new ArrayList<>(),nums);
        return ls;
    }
}