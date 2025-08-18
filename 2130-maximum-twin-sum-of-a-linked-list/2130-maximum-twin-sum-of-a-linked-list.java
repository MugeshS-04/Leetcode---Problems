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
    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        
        ListNode last = reverse(slow);

        ListNode start = head;

        int max = 0;

        while(last != null)
        {
            int sum = start.val + last.val;
            max = Math.max(max, sum);
            start = start.next;
            last = last.next;
        }

        return max;


    }

    ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        while(head != null)
        {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}