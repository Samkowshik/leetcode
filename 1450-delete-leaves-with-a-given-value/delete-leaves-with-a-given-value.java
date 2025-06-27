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
    boolean helper(TreeNode node, int target)
    {
        if(node == null) return true;
        
        boolean left = helper(node.left, target);
        if(left) node.left = null;

        boolean right = helper(node.right, target);
        if(right) node.right = null;

        return left && right && node.val==target;
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) 
    {
        return (helper(root, target) && root.val == target)? null : root;
    }
}