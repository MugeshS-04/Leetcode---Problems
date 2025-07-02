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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null)
        {
            return new ArrayList();
        }

        Queue<TreeNode> myq = new LinkedList();

        myq.add(root);

        boolean dir = true;

        List<List<Integer>> result = new ArrayList();

        while(!myq.isEmpty())
        {
            int size = myq.size();

            List<Integer> current = new ArrayList();

            while(size > 0)
            {
                TreeNode temp = myq.poll();

                if(dir)
                {
                    current.add(temp.val);
                }
                else
                {
                    current.add(0, temp.val);
                }

                if(temp.left != null)
                {
                    myq.add(temp.left);
                }
                if(temp.right != null)
                {
                    myq.add(temp.right);
                }
                
                size--;
            }

            dir = !dir;

            result.add(new ArrayList(current));
        }

        return result;
    }
}