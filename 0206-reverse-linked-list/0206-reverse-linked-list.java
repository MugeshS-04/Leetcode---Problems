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
    public ListNode reverseList(ListNode head) {
       return reverse(head);
    }

    ListNode reverse(ListNode head)
    {
        ListNode pre = null;
        while(head != null)
        {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;  
        }
        return pre;
    }
}