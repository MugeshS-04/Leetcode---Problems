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
    public ListNode modifiedList(int[] nums, ListNode head) {

        if(head == null)
        {
            return head;
        }

        HashSet<Integer> myhash = new HashSet<>();

        for(int num : nums)
        {
            myhash.add(num);
        }

        ListNode start = head;

        while(myhash.contains(start.val))
        {
            start = start.next;
        }

        ListNode fast = start;
        ListNode slow = start;

        while(fast != null)
        {
            if(myhash.contains(fast.val))
            {
                slow.next = fast.next;
            }
            else
            {
                slow = fast;
            }

            fast = fast.next;
        }

        return start;
    }
}