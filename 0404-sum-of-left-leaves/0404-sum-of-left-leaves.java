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
    public int sumOfLeftLeaves(TreeNode root) {
        int tot[] = new int[1];
        boolean isleft = false;
        sum(root, tot, isleft);
        return tot[0];
    }

    void sum(TreeNode root, int[] tot, boolean isleft)
    {
        if(root == null)
        {
            return;
        }


        sum(root.left, tot, true);

        if(root.left == null && root.right == null && isleft)
        {
            tot[0] = tot[0] + root.val;
        }

        sum(root.right, tot, false);

    }
}