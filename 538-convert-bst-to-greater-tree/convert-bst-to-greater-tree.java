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
    static int x;
    static void helper(TreeNode node)
    {
        if(node == null) return;
        helper(node.right);
        x+=node.val;
        node.val = x;
        helper(node.left);
    }
    public TreeNode convertBST(TreeNode root) 
    {
        x=0;
        helper(root);
        return root;
    }
}