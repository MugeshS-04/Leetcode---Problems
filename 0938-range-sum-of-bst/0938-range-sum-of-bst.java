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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int tot[] = new int[1];
        sum(root, low, high, tot);
        return tot[0];
    }

    void sum(TreeNode root, int low, int high, int[] tot)
    {
        if(root == null)
        {
            return;
        }

        if(root.val >= low && root.val <= high)
        {
            tot[0]+=root.val;
        }

        sum(root.right, low, high, tot);
        sum(root.left, low, high, tot);
    }
}