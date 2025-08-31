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
        ListNode ansHead = null, temp = null;
        int sum = 0;
        head = head.next;

        while(head != null)
        {
            if(head.val == 0){
                ListNode node = new ListNode(sum);
                sum = 0;
                if(ansHead == null){
                    ansHead = node; 
                    temp = node;
                }
                else{
                    temp.next = node;
                    temp = node;
                }
            }

            sum+= head.val;
            head = head.next;
        }

        return ansHead;
    }
}