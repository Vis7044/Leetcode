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
    public TreeNode replaceValueInTree(TreeNode root) {
        if(root==null) return root;
        Queue<TreeNode> q = new LinkedList<>();
        
        
        q.offer(root);
        ArrayList<Integer> levelSum = new ArrayList<>();
        while(!q.isEmpty()) {
            int lv = q.size();
            int lvSum =0;
            for(int i=0;i<lv;i++) {
                TreeNode curr = q.poll();
                lvSum += curr.val;
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            levelSum.add(lvSum);
        }
        
        root.val=0;
        q.offer(root);
        int nextLevel = 1;
        while(!q.isEmpty()) {
            int lv = q.size();
            for(int i=0;i<lv;i++) {
                TreeNode curr = q.poll();
                int siblingSum =
                    (curr.left != null ? curr.left.val : 0) +
                    (curr.right != null ? curr.right.val : 0);
                if(curr.left!=null) {
                    curr.left.val = levelSum.get(nextLevel) - siblingSum; 
                    q.offer(curr.left);
                }
                if(curr.right!=null) {
                    curr.right.val = levelSum.get(nextLevel) - siblingSum; 
                    q.offer(curr.right);
                }
                
            }
            nextLevel++;
        }
        return root;
    }
}