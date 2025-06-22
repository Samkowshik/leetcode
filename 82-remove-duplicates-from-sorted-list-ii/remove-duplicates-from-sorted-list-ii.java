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
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode ansHead = null, temp = null;
        if(head == null || head.next == null) return head;

        while(head != null)
        {
            // System.out.println(head.val);
            if(head.next == null || head.val != head.next.val)
            {
                ListNode node = head;
                head = head.next;
                node.next = null;

                if(ansHead == null)
                    ansHead = node;
                else
                    temp.next = node;
                temp = node;
            }
            else{
                int val = head.val;
                while(head != null && head.val == val)
                    head = head.next;
            }
        }
        return ansHead;
    }
}