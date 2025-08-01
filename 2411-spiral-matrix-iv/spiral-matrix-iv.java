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
    void sam(int[][] mat, int m1, int n1, int m2, int n2, ListNode node)
    {
        if(m1 > m2 || n1 > n2) return;
        for(int i=n1; i<=n2; i++)
        {
            mat[m1][i] = node == null ? -1 : node.val;
            if(node != null) node = node.next;
        }

        for(int i=m1+1; i<=m2; i++)
        {
            mat[i][n2] = node == null ? -1 : node.val;
            if(node != null) node = node.next;
        }

        if(m1 != m2)
        for(int i=n2-1; i>n1; i--)
        {
            mat[m2][i] = node == null ? -1 : node.val;
            if(node != null) node = node.next;
        }
            
        if(n1 != n2)
        for(int i=m2; i>m1 ; i--)
        {
            mat[i][n1] = node == null ? -1 : node.val;
            if(node != null) node = node.next;
        }

        sam(mat, m1+1, n1+1, m2-1, n2-1, node);
    }
    public int[][] spiralMatrix(int m, int n, ListNode head) 
    {
        int[][] mat = new int[m][n];
        sam(mat, 0, 0, m-1, n-1, head);
        return mat;
        
    }
}