class Solution {
     public int[] nse(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1;i>=0;i--) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty()? arr.length:st.peek();
            st.push(i);
        }
        return ans;
    }
    public int [] psee(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++) {
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty()? -1:st.peek();
            st.push(i);
        }
        return ans;
    }
    public long sumSubarrayMins(int[] arr) {
        int ans =0;
        long total = 0;
        int n = arr.length;
        int[] ps = psee(arr);
        int[] ns = nse(arr);
        for(int i=0;i<n;i++) {
            long left = i-ps[i];
            long right = ns[i]-i;
            total = (total+ ( left * right* arr[i]));
        }
        return total;
    }
     public int[] nge(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1;i>=0;i--) {
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty()? arr.length:st.peek();
            st.push(i);
        }
        return ans;
    }
    public int [] pgee(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++) {
            while(!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty()? -1:st.peek();
            st.push(i);
        }
        return ans;
    }
    public long sumSubarrayMax(int[] arr) {
        int ans =0;
        long total = 0;
        int n = arr.length;
        int[] pg = pgee(arr);
        int[] ng = nge(arr);
        for(int i=0;i<n;i++) {
            long left = i-pg[i];
            long right = ng[i]-i;
            total = (total+ ( left * right* arr[i]));
        }
        return total;
    }
    public long subArrayRanges(int[] nums) {
        long max =  sumSubarrayMax(nums);
        long min = sumSubarrayMins(nums);
        return max-min;
    }
}