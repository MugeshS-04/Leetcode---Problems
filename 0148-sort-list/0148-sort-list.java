/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null)
        {
            return head;
        }
        PriorityQueue <Integer> myq = new PriorityQueue<>();
        while(head != null)
        {
            myq.add(head.val);
            head = head.next;
        }

        ListNode h1 = new ListNode(myq.poll());
        ListNode temp = h1;

        while(!myq.isEmpty())
        {
            ListNode node = new ListNode(myq.poll());
            temp.next = node;
            temp = temp.next;
        }

        return h1;
    }
}