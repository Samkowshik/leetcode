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
    public int pairSum(ListNode head) 
    {
        ListNode slw = head, fst = head.next, tmp = null, nHead = null;
        while(fst.next != null)
        {
            fst = fst.next.next;
            tmp = slw;
            slw = slw.next;

            tmp.next = nHead;
            nHead = tmp;
        }

        tmp = slw;
        slw = slw.next;
        tmp.next = nHead;
        nHead = tmp;

        int ans = 0;
        while(nHead != null)
        {
            ans = Math.max(ans, nHead.val+slw.val);
            nHead = nHead.next;
            slw = slw.next;
        }
        return ans;
    }
}