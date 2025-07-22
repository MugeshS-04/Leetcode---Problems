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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        PriorityQueue<Integer> myq = new PriorityQueue<>();

        Queue<TreeNode> myqw = new LinkedList();

        myqw.add(root1);
        myqw.add(root2);

        while(!myqw.isEmpty())
        {
            int size = myqw.size();

            while(size > 0)
            {
                TreeNode temp = myqw.poll();

                if(temp != null) myq.add(temp.val);

                if(temp != null && temp.right != null) myqw.add(temp.right);
                if(temp != null && temp.left != null) myqw.add(temp.left);

                size--;
            }

        }

        List<Integer> mylist = new ArrayList();

        while(!myq.isEmpty())
        {
            mylist.add(myq.poll());
        }

        return mylist;
    }
}