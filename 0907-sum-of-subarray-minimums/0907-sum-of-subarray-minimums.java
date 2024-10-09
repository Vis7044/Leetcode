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
    public int sumSubarrayMins(int[] arr) {
        int ans =0;
        long total = 0;
        int n = arr.length;
        int mod = (int)1e9+7;
        int[] ps = psee(arr);
        int[] ns = nse(arr);
        for(int i=0;i<n;i++) {
            long left = i-ps[i];
            long right = ns[i]-i;
            total = (total+ ( left * right* arr[i])%mod)%mod;
        }
        return (int)total;
    }
}