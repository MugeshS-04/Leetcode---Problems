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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList();

        if(root == null)
        {
            return result;
        }

        Queue <TreeNode> myq = new LinkedList();

        myq.add(root);

        while(!myq.isEmpty())
        {
            int size = myq.size();

            double tot = 0;

            int count = size;

            while(size > 0)
            {
                TreeNode temp = myq.poll();

                tot+=temp.val;

                if(temp.left != null) myq.add(temp.left);

                if(temp.right != null) myq.add(temp.right);

                size--;
            }

            double avg = (double)(tot / count);

            result.add(avg);
        }

        return result;
    }
}