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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode temp = head;
        ListNode main2 = head;

        while(main2 != null && main2.val >= x)
        {
            main2 = main2.next;
        }

        if(main2 == null)
        {
            return head;
        }
        ListNode main = main2;

        Queue <Integer> myqueue = new LinkedList();

        while(temp != null)
        {
            if(temp == main)
            {
                temp = temp.next;
                continue;
            }

            else if(temp.val < x)
            {
                main.next = temp;
                main = main.next;
            }
            else
            {
                myqueue.add(temp.val);
            }
            temp = temp.next;
        }

        temp = head.next;

        while(!myqueue.isEmpty())
        {            
            main.next = new ListNode(myqueue.poll());
            main = main.next;
        }

        return main2;
    }
}