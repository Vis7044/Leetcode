class Solution {
    int [] pse(int [] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++) {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return ans;
    }
    int [] nse(int [] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--) {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return ans;
    }
    public int largestRectangleArea(int[] heights) {
        int ps[] = pse(heights);
        int ns[] = nse(heights);
        int max = -1;
        for(int i=0;i<heights.length;i++) {
            int area = (ns[i]-ps[i]-1) * heights[i];
            max = Math.max(max,area);
        }
        return max;
    }
}