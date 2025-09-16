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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root == null) return root;

        Queue<TreeNode> myq = new LinkedList<>();
        Stack<Integer> mystack = new Stack<>();

        myq.add(root);

        int level = -1;

        while(!myq.isEmpty())
        {
            int size = myq.size();

            level++;

            while(size != 0)
            {
                TreeNode node = myq.poll();

                if(level % 2 == 0)
                {
                    if(node.left != null) mystack.add(node.left.val);
                    if(node.right != null) mystack.add(node.right.val);
                }

                if(node.left != null) myq.add(node.left);
                if(node.right != null) myq.add(node.right);

                size--;
            }

            if(level % 2 == 0)
            {
                int s = myq.size();

                while(s != 0)
                {
                    TreeNode temp = myq.poll();
                    temp.val = mystack.pop();
                    myq.add(temp);
                    s--;
                }
            }
        }

        return root;
    }
}