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
    public ListNode removeNodes(ListNode head) {
        if(head == null)
        {
            return head;
        }
        head = reverse(head);
        int max = head.val;
        ListNode temp = head;

        while(temp != null && temp.next != null)
        {
            if(temp.next.val < max)
            {
                temp.next = temp.next.next;
            }
            else
            {
                temp = temp.next;
                max = temp.val;
            }
        }
        
        head = reverse(head);
        return head;
    }

    ListNode reverse(ListNode head)
    {
        ListNode pre = null;
        while(head!= null)
        {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}