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
    public int sumNumbers(TreeNode root) {
        int result[] = new int[1];
        sum(root, new StringBuilder(), result);
        return result[0];
    }

    void sum(TreeNode root, StringBuilder sb, int[] result)
    {
        if(root == null)
        {
            return;
        }
        
        sb.append(root.val);

        if(root.left == null && root.right == null)
        {
            if(sb.length() > 0)
            {
                int num = Integer.parseInt(new String(sb));
                System.out.println(num);
                result[0] += num;
            }
        }


        sum(root.left, sb, result);

        sum(root.right, sb, result);

        sb.deleteCharAt(sb.length() - 1);
    }
}