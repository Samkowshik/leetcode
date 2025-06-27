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
    int helper(TreeNode node, boolean gp, boolean p)
    {
        if(node == null) return 0;
        return (gp?node.val:0) + helper(node.left, p, node.val%2==0) + helper(node.right, p, node.val%2==0);
    }
    public int sumEvenGrandparent(TreeNode root) 
    {
        return helper(root, false, false);
    }
}