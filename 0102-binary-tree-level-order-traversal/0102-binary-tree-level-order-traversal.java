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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList();

        if(root == null)
        {
            return result;
        }

        Queue<TreeNode> myqueue = new LinkedList<>();

        myqueue.add(root);

        while(myqueue.size() > 0)
        {
            List<Integer> current = new ArrayList<>();

            int size = myqueue.size();

            while(size != 0)
            {
                current.add(myqueue.peek().val);

                if(myqueue.peek().left != null)
                {
                    myqueue.add(myqueue.peek().left);
                }
                if(myqueue.peek().right != null)
                {
                    myqueue.add(myqueue.peek().right);
                }

                myqueue.poll();
                size--;
            }

            result.add(new ArrayList(current));
        }
    return result;
    }
}