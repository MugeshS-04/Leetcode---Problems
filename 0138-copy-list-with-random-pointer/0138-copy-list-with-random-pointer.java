/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
        {
            return head;
        }
        Node h1 = new Node(head.val);
        Node temp = head.next;
        Node temp2 = h1;
        Node ran = h1;

        while(temp != null)
        {
            Node node = new Node(temp.val);
            temp2.next = node;
            temp2 = temp2.next;
            temp = temp.next;
        }
        temp = head;
        Node ran1 = head;
        temp2 = h1;


        while(temp != null)
        {
            ran = h1;
            ran1 = head;
            if(temp.random != null)
            {
                while(temp.random != ran1)
                {
                    ran1 = ran1.next;
                    ran = ran.next;
                }
            }
            else
            {
                ran = null;
            }
            temp2.random = ran;
            temp2 = temp2.next;
            temp = temp.next;
        }
        return h1;
    }
}