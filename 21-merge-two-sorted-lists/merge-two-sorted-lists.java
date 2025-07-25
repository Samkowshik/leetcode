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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode head = null;
        if(list1.val < list2.val){
            ListNode node = list1;
            head = node;
            list1 = list1.next;
        }
        else{
            ListNode node = list2;
            head = node;
            list2 = list2.next;
        }
        ListNode temp = head;

        while(list1 != null || list2 != null)
        {
            if(list1 == null){
                temp.next = list2;
                break;
            }
            if(list2 == null){
                temp.next = list1;
                break;
            } 
            if(list1.val < list2.val){
                ListNode node = list1;
                list1 = list1.next;
                temp.next = node;
                temp = temp.next;
            }
            else{
                ListNode node = list2;
                list2 = list2.next;
                temp.next = node;
                temp = temp.next;
            }
        }
        return head;
    }
}