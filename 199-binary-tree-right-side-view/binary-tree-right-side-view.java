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
    static List<Integer> ans;
    static int maxd;
    static void sam(TreeNode node, int d)
    {
        if(node == null) return;
        if(d>maxd)
        {
            ans.add(node.val);
            maxd = d;
        }
        sam(node.right, d+1);
        sam(node.left, d+1);
    }
    public List<Integer> rightSideView(TreeNode root) 
    {
        ans = new ArrayList<>();
        maxd = 0;
        sam(root, 1);
        return ans;
    }
}