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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ls = new ArrayList<List<Integer>>();
        if(root==null) return ls;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean leftToRight = true;
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<n;i++){
          
                if(q.peek().left !=null) q.offer(q.peek().left);
                if(q.peek().right !=null) q.offer(q.peek().right);
                l.add(q.poll().val);
            }
            if(leftToRight==false){
                Collections.reverse(l);
            }
            leftToRight = !leftToRight;
            ls.add(l);
        
        }
        return ls;
    }
}