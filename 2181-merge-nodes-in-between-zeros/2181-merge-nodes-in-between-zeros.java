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
    public ListNode mergeNodes(ListNode head) {
        if(head == null)
        {
            return head;
        }

        ListNode temp = head;
        ListNode main = head;
        ListNode main2 = head;
        int count = 0;

        boolean flag = false;

        while(temp != null)
        {
            if(temp.val == 0 && flag == false)
            {
                flag = true;
                temp = temp.next;
            }
            else if(temp.val == 0 && flag == true)
            {
                main.val = count;
                count = 0;
                main2 = main;
                main = main.next;
                flag = false;
            }
            else
            {
                count+=temp.val;
                temp = temp.next;
            }
        }
        main2.next = null;
        return head;
    }
}