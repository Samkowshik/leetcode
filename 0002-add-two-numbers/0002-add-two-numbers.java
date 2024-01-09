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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode head=null, temp = head;
        int c =0;
        while(l1!= null && l2!= null)
        {
            int x = l1.val+l2.val+c;
            if(x>9)
            {
                c = x/10;
                x%= 10;
            }
            else  c=0;
            ListNode n = new ListNode(x);
            if(head == null)
            {
                head = n;
                temp = n;
            }
            else
            {
                temp.next= n;
                temp = temp.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1!= null)
        {
            int x = l1.val+c;
            if(x>9)
            {
                c = x/10;
                x%= 10;
            }
            else c=0;
            ListNode n = new ListNode(x);
            temp.next= n;
            temp = temp.next;
            l1 = l1.next;
        }
         while (l2!= null)
        {
            int x = l2.val+c;
            if(x>9)
            {
                c = x/10;
                x%= 10;
            }
            else c=0;
            ListNode n = new ListNode(x);
            temp.next= n;
            temp = temp.next;
            l2 = l2.next;
        }
        if(c>0)
        {
            ListNode n = new ListNode(c);
            temp.next= n;
        }
        return head;
    }
}