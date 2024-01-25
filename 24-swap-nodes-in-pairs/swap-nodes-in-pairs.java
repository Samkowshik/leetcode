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
    public ListNode swapPairs(ListNode head) 
    {
        if(head == null || head.next == null) return head;
        ListNode temp1 = head, temp2 = head.next, temp3 = head.next.next;
        temp1.next = null;
        temp2.next = temp1;
        temp1.next = swapPairs(temp3);
        return temp2;
    }
}