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
    static int[] helper(TreeNode node)
    {
        if(node == null) return new int[]{0,0};

        int[] left = helper(node.left);
        int[] right = helper(node.right);

        int sum = left[0]+right[0] + node.val;
        int cnt = left[1]+right[1] + 1;

        if(sum/cnt == node.val) ans++;

        return new int[]{sum,cnt};
    }
    public int averageOfSubtree(TreeNode root) 
    {
        ans = 0;
        helper(root);

        return ans;
    }
}