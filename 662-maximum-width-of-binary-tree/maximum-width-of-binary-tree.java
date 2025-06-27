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
    static int ans;
    static int[] min, max;
    static void helper(TreeNode node, int d, int p)
    {
        if(node == null) return;
        if(min[d]==0) min[d] = p;
        max[d] = p;
        ans = Math.max(ans, max[d]-min[d]);
        helper(node.left, d+1, p*2-1);
        helper(node.right, d+1, p*2);
    }
    public int widthOfBinaryTree(TreeNode root) 
    {
        ans = 0;
        min = new int[3001];
        max = new int[3001];

        helper(root, 0, 1);

        return ans+1;
    }
}