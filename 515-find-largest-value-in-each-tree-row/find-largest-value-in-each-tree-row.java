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
    static void sam(TreeNode node, int d)
    {
        if(node == null) return;
        if(ans.size()<=d)
            ans.add(node.val);
        else if(ans.get(d)<node.val)
            ans.set(d,node.val);
        sam(node.left, d+1);
        sam(node.right, d+1);
    }
    public List<Integer> largestValues(TreeNode root) 
    {
        ans = new ArrayList<>();
        sam(root, 0);
        return ans;
    }
}