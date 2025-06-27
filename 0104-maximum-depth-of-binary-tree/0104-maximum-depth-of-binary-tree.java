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
    public int maxDepth(TreeNode root) {
        return maximum(root, new int[1], 0);
    }

    int maximum(TreeNode root, int[] max, int cur)
    {
        if(root == null)
        {
            max[0] = Math.max(max[0], cur);
            return max[0];
        }

        maximum(root.left, max, cur+1);
        maximum(root.right, max, cur+1);

        return max[0];
    }
}