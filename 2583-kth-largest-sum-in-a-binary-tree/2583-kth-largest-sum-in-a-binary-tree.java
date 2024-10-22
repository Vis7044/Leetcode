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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        PriorityQueue<Long> pq = new PriorityQueue<>();
        while(!q.isEmpty()) {
            int n = q.size();
            long sum = 0;
            for(int i=0;i<n;i++) {
                TreeNode temp = q.poll();
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
                sum += temp.val;
            }
            pq.add(sum); 
            if(pq.size()>k) pq.poll();
        }
        return pq.size()==k?pq.peek():-1;
    }
}