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
    public void reorderList(ListNode head) {
        if(head == null)
        {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode l1 = slow.next;
        slow.next = null;
        l1 = reverse(l1);
        slow = head;
        while(l1 != null)
        {
            ListNode temp = slow.next;
            ListNode temp1 = l1.next;
            slow.next = l1;
            l1.next = temp;
            l1 = temp1;
            slow = temp;
        }
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