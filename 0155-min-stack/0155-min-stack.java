class MinStack {
    class Pair {
        int x;
        int y;
        Pair(int x,int y) {
            this.x = x;
            this.y=y;
        }
    }
    Stack<Pair> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()) st.push(new Pair(val,val));
        else {
            st.push(new Pair(val,Math.min(val,st.peek().y)));
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().x;
    }
    
    public int getMin() {
        return st.peek().y;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */