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
    public List<Integer> largestValues(TreeNode root) {
        if(root == null)
        {
            return new ArrayList<>();
        }

        Queue<TreeNode> myq = new LinkedList();

        List<Integer> result = new ArrayList<>();

        myq.add(root);

        while(!myq.isEmpty())
        {
            int size = myq.size();
            int max = Integer.MIN_VALUE;

            while(size > 0)
            {
                TreeNode temp = myq.poll();

                if(temp.val > max)
                {
                    max = temp.val;
                }

                if(temp.left != null) myq.add(temp.left);
                if(temp.right != null) myq.add(temp.right);

                size--;
            }
            result.add(max);
        }

        return result;
    }
}