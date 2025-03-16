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
    public ListNode oddEvenList(ListNode head) 
    {
        if(head == null || head.next == null || head.next.next == null) return head;
        ListNode odd = head, evn = head.next, evnH = evn;
        while(odd.next != null && evn.next != null)
        {
            odd.next = odd.next.next;
            odd = odd.next;

            evn.next = evn.next.next;
            evn = evn.next;
        }
        odd.next = evnH;
        return head;
    }
}