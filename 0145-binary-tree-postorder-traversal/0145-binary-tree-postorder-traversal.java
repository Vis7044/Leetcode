/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder = new ArrayList<>();
        if(root==null) return postorder;
        Stack<TreeNode> st = new Stack<>();
        while(root!=null || !st.isEmpty()){
            if(root!=null){
                st.push(root);
                root=root.left;
            }else{
                TreeNode temp = st.peek().right;
                if(temp==null){
                    TreeNode curr = st.peek();
                    st.pop();
                    postorder.add(curr.val);
                    while(!st.isEmpty() && curr==st.peek().right){
                        curr = st.peek();
                        st.pop();
                        postorder.add(curr.val);
                    }
                }else{
                    root=temp;
                }
            }
        }
        return postorder;
    }
}