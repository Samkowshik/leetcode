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
    static int ans;
    static void sam(TreeNode node, int val , int f)
    {
        if(node == null) return;
        ans = Math.max(ans, val);
        
        if(f==1)
        {
            sam(node.right, val+1, -1);
            sam(node.left, 1, 1);
        }
        if(f==-1)
        {
            sam(node.right, 1, -1);
            sam(node.left, val+1, 1);
        }
    }
    public int longestZigZag(TreeNode root) 
    {
        ans = 0;
        sam(root.right, 1, -1);
        sam(root.left, 1, 1);
        return ans;
    }
}