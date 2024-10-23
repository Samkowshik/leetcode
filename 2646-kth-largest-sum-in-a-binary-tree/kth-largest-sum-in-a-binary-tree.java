/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    static long[] lst;
    static int m;
    static void sam(TreeNode node, int d)
    {
        if(d>m) m = d;
        if(node == null) return;

        lst[d] += node.val;

        sam(node.left, d+1);
        sam(node.right, d+1);
        return;
    }
    public long kthLargestLevelSum(TreeNode root, int k) 
    {
        lst = new long[100001];
        m = 0;
        sam(root, 0);
        
        if(k > m) return -1;
        Arrays.sort(lst,0,m);

        return lst[m-k];
    }
}