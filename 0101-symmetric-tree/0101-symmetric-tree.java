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
    public boolean isSymmetric(TreeNode root) {
         return isvalid(root.left, root.right);
    }

    boolean isvalid(TreeNode r1, TreeNode r2)
    {
        if(r1 == null && r2 == null)
        {
            return true;
        }
        else if(r1 == null || r2 == null)
        {
            return false;
        }

        boolean result = (r1.val == r2.val) && isvalid(r1.right, r2.left) && isvalid(r1.left, r2.right);

        return result;
    }
}