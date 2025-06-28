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
    static List<Integer> lst;
    static void makeList(TreeNode node)
    {
        if(node == null) return;

        makeList(node.left);
        lst.add(node.val);
        makeList(node.right);
    }

    static TreeNode buildTree(int l, int r)
    {
        if(l==r) return null;

        int m = (l+r)/2;
        TreeNode node = new TreeNode(lst.get(m));
        node.left = buildTree(l,m);
        node.right = buildTree(m+1,r);

        return node;
    }
    public TreeNode balanceBST(TreeNode root) 
    {
        lst = new ArrayList<>();
        makeList(root);
        return buildTree(0, lst.size());
    }
}