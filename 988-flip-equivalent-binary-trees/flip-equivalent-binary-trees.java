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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) 
    {
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        if(root1.val != root2.val) return false;
        
        int xlv = root1.left == null? 0 : root1.left.val;
        int xrv = root1.right == null? 0 : root1.right.val;
        int ylv = root2.left == null? 0 : root2.left.val;
        int yrv = root2.right == null? 0 : root2.right.val;

        if((xlv ^ xrv ^ ylv ^ yrv) != 0) return false;

        boolean ans;
        TreeNode node = null;

        if(xlv == ylv)
        {
            node = root2.right;
            ans = flipEquiv(root1.left, root2.left);
        }
        else if(xlv == yrv)
        {
            node = root2.left;
            ans = flipEquiv(root1.left, root2.right);
        }
        else 
        return false;

        return ans && flipEquiv(root1.right, node);

    }
}