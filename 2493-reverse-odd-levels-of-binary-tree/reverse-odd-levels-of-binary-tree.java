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
    static Queue<Integer> que;
    static void makeQ(TreeNode root, int l)
    {
        if(root == null) return;
        makeQ(root.right, l+1);
        makeQ(root.left, l+1);
        if(l%2==1) que.add(root.val);
    }
    static void makeT(TreeNode root, int l)
    {
        if(root == null) return;
        makeT(root.left, l+1);
        makeT(root.right, l+1);
        if(l%2==1) root.val = que.remove();
    }
    public TreeNode reverseOddLevels(TreeNode root) 
    {
        que = new LinkedList<>();
        makeQ(root,0);
        makeT(root,0);
        return root;
    }
}