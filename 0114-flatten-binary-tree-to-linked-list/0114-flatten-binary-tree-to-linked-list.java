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
    public void flatten(TreeNode root) {
        if(root == null) return;
        Stack<TreeNode> mystack = new Stack();

        mystack.push(root);

        while(!mystack.isEmpty())
        {
            TreeNode cur = mystack.pop();

            if(cur.right != null) mystack.push(cur.right);
            if(cur.left != null) mystack.push(cur.left);

            if(!mystack.isEmpty()) cur.right = mystack.peek();
            cur.left = null;
        }
    }
}