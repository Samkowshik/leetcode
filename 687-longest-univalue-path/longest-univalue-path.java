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
    static int max;
    static int helper(TreeNode node)
    {
        if(node == null) return 0;

        int left = helper(node.left), right = helper(node.right), path = 0;

        if(node.left != null && node.left.val == node.val && node.right != null && node.right.val == node.val)
        {
            max = Math.max(max, left + right);
            return Math.max(left, right)+1;
        }
        else if(node.left != null && node.left.val == node.val)
            path = left;
        else if(node.right != null && node.right.val == node.val)
            path = right;

        max = Math.max(max, path);
        return path+1;
    }
    public int longestUnivaluePath(TreeNode root) 
    {
        max = 0;
        helper(root);
        return max;
    }
}