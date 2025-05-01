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
    static int sam(TreeNode node, int max)
    {
        if(node == null) return 0;
        return (node.val >= max ? 1:0) + sam(node.left, Math.max(max, node.val)) + sam(node.right, Math.max(max, node.val));
    } 
    public int goodNodes(TreeNode root) 
    {
        return sam(root, root.val);
    }
}