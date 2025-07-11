/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {

        if(root == null)
        {
            return root;
        }

        Queue<Node> myq = new LinkedList();

        myq.add(root);

        while(!myq.isEmpty())
        {
            int size = myq.size();

            Node pass = null;

            while(size > 0)
            {
                Node temp = myq.poll();

                temp.next = pass;

                pass = temp;

                if(temp.right != null) myq.add(temp.right);

                if(temp.left != null) myq.add(temp.left);

                size--;
            }
        }

        return root;
    }
}