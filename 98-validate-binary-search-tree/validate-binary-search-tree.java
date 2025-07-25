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
    long x = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) 
    {
        if(root == null) return true;

        if(!isValidBST(root.left) || x>=root.val) return false;

        x = root.val;
        return isValidBST(root.right);
    }
}