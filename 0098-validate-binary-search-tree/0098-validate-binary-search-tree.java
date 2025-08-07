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
    public boolean isValidBST(TreeNode root) {
        return validcheck(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    boolean validcheck(TreeNode root, long min, long max)
    {
        if(root == null)
        {
            return true;
        }

        if(root.val <= min || root.val >= max)
        {
            return false;
        }

        return validcheck(root.left, min, root.val) && validcheck(root.right, root.val, max);
    }
}