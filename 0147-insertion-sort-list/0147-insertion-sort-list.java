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
    public ListNode insertionSortList(ListNode head) {
        if(head == null)
        {
            return head;
        }
        ListNode dum = new ListNode(0);
        ListNode cur = head;

        while(cur != null)
        {
            ListNode pre = dum;
            ListNode next = cur.next;

            while(pre.next != null && pre.next.val < cur.val)
            {
                pre = pre.next;
            }

            cur.next = pre.next;
            pre.next = cur;

            cur = next;
        }

        return dum.next;
        
    }
}