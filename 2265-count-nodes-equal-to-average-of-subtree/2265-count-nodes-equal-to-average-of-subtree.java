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
    public int averageOfSubtree(TreeNode root) {
        Queue<TreeNode> myq = new LinkedList();
        myq.add(root);
        int count = 0;

        while(!myq.isEmpty())
        {
            int size = myq.size();
            int avg = 0;

            while(size > 0)
            {
                TreeNode temp = myq.poll();
                int arr[] = new int[2];
                findavg(temp, arr);
                
                if(arr[0] != 0)
                {
                    avg = arr[1] / arr[0];
                }

                if(temp != null && avg == temp.val)
                {
                    count++;
                }

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
        }

        return count;
    }

    void findavg(TreeNode root, int arr[])
    {
        if(root == null)
        {
            return;
        }

        arr[0] = arr[0] + 1;
        arr[1] = arr[1] + root.val;

        findavg(root.left, arr);
        findavg(root.right, arr);

        return;
    }
}