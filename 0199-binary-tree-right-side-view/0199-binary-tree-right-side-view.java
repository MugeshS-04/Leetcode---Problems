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
    public List<Integer> rightSideView(TreeNode root) {

        if(root == null)
        {
            return new ArrayList();
        } 
        List<Integer> mylist = new ArrayList();

        Queue<TreeNode> myq = new LinkedList();

        myq.add(root);

        while(!myq.isEmpty())
        {
            int size = myq.size();

            while(size > 0)
            {
                TreeNode temp = myq.poll();

                if(size == 1)
                {
                    mylist.add(temp.val);
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

        }

        return mylist;
    }
}