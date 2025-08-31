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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();

        treepath(root, result, new String());

        return result;
    }

    void treepath(TreeNode root, List<String> result, String path)
    {
        if(root == null) return;

        if(path.length() == 0) path = root.val+"";
        else path = path+"->"+root.val;

        if(root.left == null && root.right == null)
        {
            result.add(new String(path));
        }

        treepath(root.left, result, path);
        treepath(root.right, result, path);

        return;
    }

}