class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int arr[] = new int[n];
        
        int i=2*n-1;
        while(i>=0) {
            while(!st.isEmpty() && st.peek()<=nums[i%n]) {
                st.pop();
            }
            if(i<n) {
                arr[i] = st.isEmpty()?-1:st.peek();
            }
            st.push(nums[i%n]);
            i--;
        }
        return arr;
    }
}