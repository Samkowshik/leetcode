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
    static int maxd, ans;
    static void helper(TreeNode node, int d)
    {
        if(node == null) return;
        if(node.left == null && node.right == null)
        {
            if(d>maxd){
                maxd = d;
                ans = 0;
            }
            if(d==maxd) ans+=node.val;
            return;
        }
        helper(node.left, d+1);
        helper(node.right, d+1);
    }
    public int deepestLeavesSum(TreeNode root) 
    {
        ans = 0; maxd = 0;
        helper(root, 1);
        return ans;
    }
}