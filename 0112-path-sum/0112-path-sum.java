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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathsum(root, 0, targetSum);
    }

    boolean pathsum(TreeNode root, int cursum, int target)
    {
        // base case
    if (root == null) return false;

// if it's a leaf
    if (root.left == null && root.right == null && target == root.val) return true;

// recur left and right
    return hasPathSum(root.left, target - root.val) || hasPathSum(root.right, target - root.val);

    }
}