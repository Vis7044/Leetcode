class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        if (n < 4) return res;

        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            threeSum(nums, i + 1, n, target - nums[i], nums[i], res);
        }
        return res;
    }

    // helper for 3Sum
    private void threeSum(int[] nums, int start, int n, int target,
                          int first, List<List<Integer>> res) {

        for (int i = start; i < n - 2; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;

            int l = i + 1, h = n - 1;

            while (l < h) {
                long sum = (long) nums[i] + nums[l] + nums[h];

                if (sum == target) {
                    res.add(Arrays.asList(first, nums[i], nums[l], nums[h]));

                    while (l < h && nums[l] == nums[l + 1]) l++;
                    while (l < h && nums[h] == nums[h - 1]) h--;

                    l++;
                    h--;
                }
                else if (sum < target) {
                    l++;
                }
                else {
                    h--;
                }
            }
        }
    }
}
