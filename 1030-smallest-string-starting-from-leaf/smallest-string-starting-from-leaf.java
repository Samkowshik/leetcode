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
    static String ans;
    static void sam(TreeNode root, String s)
    {
        if(root == null) return;
        s = (char)(root.val+'a')+s;
        if(root.left == null && root.right == null)
        {
            if(ans.length() == 0 || ans.compareTo(s) > 0)
                ans = s;
            return;
        }
        sam(root.left, s);
        sam(root.right, s);
    }
    public String smallestFromLeaf(TreeNode root) 
    {
        ans = "";
        sam(root, "");

        return ans;
    }
}