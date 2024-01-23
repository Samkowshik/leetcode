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
    static int fun(ListNode head, int n)
    {
        if(head == null) return n;
        n = fun(head.next,n);
        if(n==0)
            head.next = head.next.next;
        return n-1;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        return fun(head,n)==0? head.next: head;
    }
}