class Solution {
    void solve(List<List<Integer>> ls, ArrayList<Integer> temp, int nums[],boolean flag[]) {
        if(temp.size()==nums.length && !ls.contains(temp)) {
            ls.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=0;i<nums.length;i++) {
            if(flag[i]) continue;
            
            flag[i]=true;
            temp.add(nums[i]);
            solve(ls,temp,nums,flag);
            flag[i]=false;
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(nums);
        solve(ls,new ArrayList<>(),nums,new boolean[nums.length]);
        return ls;
    }
}