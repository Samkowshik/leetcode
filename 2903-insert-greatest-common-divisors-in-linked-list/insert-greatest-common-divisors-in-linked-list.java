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
    int findHcf(int a, int b)
    {
        if(a>b)
            a-=b;
        else if(b>a)
            b-=a;
        else
            return a;

        return findHcf(a, b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) 
    {
        ListNode back = head, front = head.next, node = null;
        while(front != null)
        {
            node = new ListNode(findHcf(back.val, front.val));
            back.next = node;
            node.next = front;

            back = front;
            front = front.next;
        }

        return head;
    }
}