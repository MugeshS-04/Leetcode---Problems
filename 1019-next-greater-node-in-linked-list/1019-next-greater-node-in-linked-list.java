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
    public int[] nextLargerNodes(ListNode head) {

        ListNode temp = head;
        int count = 0;

        while(temp != null)
        {
            temp = temp.next;
            count++;
        }

        int[] result = new int[count];

        ListNode start = head;
        temp = start;
        int i = 0;
        int val = 0;

        while(start.next != null)
        {
            while(temp != null)
            {
                if(temp.val > start.val)
                {
                    val = temp.val;
                    break;
                }
                temp = temp.next;
            }

            if(temp != null) result[i] = val;
            start = start.next;
            temp = start.next;
            i++;
        }

        System.out.print(count);

        return result;
    }
}