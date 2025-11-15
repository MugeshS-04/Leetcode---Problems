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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n == 0 || head.next == null)
        {
            return null;
        }

        int size = 0;

        ListNode temp = head;

        while(temp != null)
        {
            temp = temp.next;
            size++;
        }
        temp = head;

        int val = size - n;
        if(val == 0)
        {
            return head.next;
        }

        for(int i = 0; i < size; i++)
        {
            if((i+1) == val)
            {
                if(temp.next != null)
                {
                    temp.next = temp.next.next; 
                }
                else
                {
                    temp.next = null;
                }
                return head;
            }
            temp = temp.next;
        }

        return head;
    }
}