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
    public int findBottomLeftValue(TreeNode root) {
        int val = 0;

        Queue<TreeNode> myq = new LinkedList();

        myq.add(root);

        while(!myq.isEmpty())
        {
            int size = myq.size();

            while(size > 0)
            {
                TreeNode temp = myq.poll();

                val = temp.val;

                if(temp.right != null) myq.add(temp.right);

                if(temp.left != null) myq.add(temp.left);

                size--;
            }

        }

        return val;
    }
}