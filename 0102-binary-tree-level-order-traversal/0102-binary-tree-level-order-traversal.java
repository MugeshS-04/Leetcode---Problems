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

        Deque<TreeNode> mydeque = new ArrayDeque<>();

        mydeque.addFirst(root);

        while(mydeque.size() > 0)
        {
            List<Integer> current = new ArrayList<>();

            int size = mydeque.size();

            while(size != 0)
            {
                current.add(mydeque.peekLast().val);
                if(mydeque.peekLast() != null && mydeque.peekLast().left != null)
                {
                    mydeque.addFirst(mydeque.peekLast().left);
                }
                if(mydeque.peekLast() != null && mydeque.peekLast().right != null)
                {
                    mydeque.addFirst(mydeque.peekLast().right);
                }
                mydeque.removeLast();
                size--;
            }

            result.add(new ArrayList(current));
        }
    return result;
    }
}