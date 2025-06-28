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
    public int sumRootToLeaf(TreeNode root) {
        int tot[] = new int[1];
        sum(root, tot, new String());
        return tot[0];
    }

    void sum(TreeNode root, int[] tot, String num)
    {
        if(root == null)
        {
            return;
        }

        num += root.val+"";

        if(root.left == null && root.right == null)
        {
            int val = Integer.parseInt(num, 2);
            tot[0] = tot[0] + val;
        }
        sum(root.left, tot, num);
        sum(root.right, tot, num);


    }
}