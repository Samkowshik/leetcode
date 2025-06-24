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
    public String tree2str(TreeNode root) 
    {
        if(root == null) return "";
        
        String s = Integer.toString(root.val);

        if(root.left == null && root.right == null)
        return s;
        if(root.left == null)
        return s+"("+")"+"("+tree2str(root.right)+")";
        if(root.right == null)
        return s+"("+tree2str(root.left)+")";

        return s+"("+tree2str(root.left)+")"+"("+tree2str(root.right)+")";
    }
}