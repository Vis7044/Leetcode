class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> mp = new HashMap<>();
        int arr[] = new int[2];
        Arrays.fill(arr,-1);
        for(int i=0;i<nums.length;i++) {
            int rem = target - nums[i];
            if(mp.containsKey(rem)) {
                arr[1]=mp.get(rem);
                arr[0]=i;
                return arr;
            }
            mp.put(nums[i],i);
        }
        return arr;
    }
}