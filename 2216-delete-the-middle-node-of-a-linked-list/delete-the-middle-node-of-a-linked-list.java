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
class Solution 
{
    public ListNode deleteMiddle(ListNode head) 
    {
        if(head.next == null) return null;
        ListNode rab = head, tor = head, tail = new ListNode(-1, head);
        
        while(rab.next != null && rab.next.next != null)
        {
            rab = rab.next.next;
            tor = tor.next;
            tail = tail.next;
        }
        if(rab.next != null && rab.next.next == null)
        {
            tor = tor.next;
            tail = tail.next;
        }

        tail.next = tor.next;
        return head;
    }
}