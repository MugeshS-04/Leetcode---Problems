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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        if(root == null)
        {
            return new ArrayList();
        }
        Stack <List<Integer>> mystack = new Stack();
        Queue <TreeNode> myq = new LinkedList();

        myq.add(root);

        List<List<Integer>> result = new ArrayList();

        while(!myq.isEmpty())
        {
            int size = myq.size();
            List<Integer> cur = new ArrayList();

            while(size > 0)
            {
                TreeNode temp = myq.poll();

                cur.add(temp.val);

                if(temp != null && temp.left != null)
                {
                    myq.add(temp.left);
                }

                if(temp != null && temp.right != null)
                {
                    myq.add(temp.right);
                }

                size--;
            }

            mystack.push(cur);
        }

        while(!mystack.isEmpty())
        {
            result.add(new ArrayList(mystack.pop()));
        }

        return result;

    }
}