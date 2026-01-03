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
    public int maxPathSum(TreeNode root) {
        int[] ans = new int[]{Integer.MIN_VALUE};
        dfs(root, ans);
        return ans[0];
    }

    private int dfs(TreeNode root, int[] ans) {
        if (root == null) return 0;

        int left = Math.max(0, dfs(root.left, ans));
        int right = Math.max(0, dfs(root.right, ans));

        // Path passing through root
        ans[0] = Math.max(ans[0], root.val + left + right);

        // Path going upward
        return root.val + Math.max(left, right);
    }
}
