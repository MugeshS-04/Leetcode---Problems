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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode main = new ListNode(0);
        ListNode temp = main;

        ListNode head1 = l1;
        ListNode head2 = l2;

        int extra = 0;

        while(head1 != null && head2 != null)
        {
            if(head1.val + head2.val + extra < 10)
            {
                ListNode node = new ListNode(head1.val + head2.val + extra);
                temp.next = node;
                temp = temp.next;
                extra = 0;
            }
            else
            {
                int ex = (head1.val + head2.val + extra) / 10;
                ListNode node = new ListNode((head1.val + head2.val + extra) % 10);
                extra = ex;
                temp.next = node;
                temp = temp.next;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        while(head1 != null)
        {
            int ex = (head1.val + extra) / 10;
            ListNode node = new ListNode((head1.val + extra) % 10);
            extra = ex;
            temp.next = node;
            temp = temp.next;
            head1 = head1.next;
        }

        while(head2 != null)
        {
            int ex = (head2.val + extra) / 10;
            ListNode node = new ListNode((head2.val + extra) % 10);
            extra = ex;
            temp.next = node;
            temp = temp.next;
            head2 = head2.next;
        }

        if(extra > 0)
        {
            temp.next = new ListNode(extra);
        }

        return main.next;
    }
}