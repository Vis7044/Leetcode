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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return l;
        queue.offer(root);
      
        while(!queue.isEmpty()){
            List<Integer> ls = new LinkedList<>();
            int n = queue.size();
            for(int i=0;i<n;i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                ls.add(queue.poll().val);
            }
            l.add(ls);

        }
        return l;
    }
}