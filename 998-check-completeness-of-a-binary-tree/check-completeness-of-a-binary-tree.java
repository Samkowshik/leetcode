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
    static int nulld;
    static boolean f;

    static int findDepth(TreeNode root)
    {
        int ans = 0;
        while(root != null)
        {
            root = root.left;
            ans++;
        } 
        return ans;
    }

    static boolean helper(TreeNode root, int d)
    {
        if(root == null){
            if(f && d+1==nulld) {
                f = false;
                nulld = d;
            }
            return d==nulld;
        }
        if(root.left == null && root.right!=null) return false;
        // System.out.println(d+" "+root.val);
        return helper(root.left, d+1) && helper(root.right, d+1);
    }
    public boolean isCompleteTree(TreeNode root) 
    {
        f = true;
        nulld = findDepth(root)+1;
        return helper(root, 1);
    }
}