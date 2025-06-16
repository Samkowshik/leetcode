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
    static void sam(TreeNode root, int sum)
    {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            ans += sum*10+root.val;
            return;
        }
        sum = sum*10+root.val;
        sam(root.left, sum);
        sam(root.right, sum);
    } 
    public int sumNumbers(TreeNode root) 
    {
        ans = 0;

        sam(root, 0);

        return ans;
    }
}