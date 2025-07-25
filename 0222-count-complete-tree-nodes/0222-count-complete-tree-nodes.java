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
    public int countNodes(TreeNode root) {
        return count(root, new int[1]);
    }

    int count(TreeNode root, int[] count)
    {
        if(root == null)
        {
            return count[0];
        }

        count[0]++;
        count(root.left, count);
        count(root.right, count);

        return count[0];
    }
}