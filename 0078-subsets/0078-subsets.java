class Solution {
    void solve(int ind,List<List<Integer>> ls,ArrayList<Integer> temp,int []nums) {
        if(ind==nums.length) {
            ls.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[ind]);
        solve(ind+1,ls,temp,nums);
        temp.remove(temp.size()-1);
        solve(ind+1,ls,temp,nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        solve(0,ls,new ArrayList<>(),nums);
        return ls;
    }
}