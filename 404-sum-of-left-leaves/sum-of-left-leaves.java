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
    static int helper(TreeNode node, boolean f)
    {
        if(node == null) return 0;
        if(f && node.left == null && node.right == null) return node.val;

        return helper(node.left, true) + helper(node.right, false);
    }
    public int sumOfLeftLeaves(TreeNode root) 
    {
        return helper(root, false);
    }
}