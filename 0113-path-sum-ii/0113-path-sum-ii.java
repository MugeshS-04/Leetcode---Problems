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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null)
        {
            return new ArrayList();
        }
        List<List<Integer>> result = new ArrayList<>();
        sum(result, new ArrayList(), root, targetSum, 0);
        return result;
    }

    void sum(List<List<Integer>> result, List<Integer> current, TreeNode root, int target, int cursum)
    {
        if(root == null)
        {
            return;
        }

        current.add(root.val);
        cursum += root.val;

        if(cursum == target && root.left == null && root.right == null)
        {
            result.add(new ArrayList(current));
        }
        else
        {
            sum(result, current, root.left, target, cursum);
            sum(result, current, root.right, target, cursum);
        }

        
        current.remove(current.size() - 1);

    }
}