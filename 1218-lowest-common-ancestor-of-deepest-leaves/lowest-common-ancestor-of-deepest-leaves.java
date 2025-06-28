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
    TreeNode ansNode;
    int findDepth(TreeNode root)
    {
        if(root == null) return 0;
        return 1 + Math.max(findDepth(root.left), findDepth(root.right));
    }
    boolean helper(TreeNode node, int d)
    {
        if(node == null) return d == 0;

        boolean left = helper(node.left, d-1), right = helper(node.right, d-1);
        if(left && right)
        ansNode = node;
        return left || right;
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) 
    {
        int d = findDepth(root);
        System.out.println(d);
        ansNode = null;
        helper(root, d);

        return ansNode;
    }
}