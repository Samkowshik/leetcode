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
    static void add(TreeNode node)
    {
        if(node == null) return;
        ans.add(node.val);
        add(node.left);
        add(node.right);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) 
    {
        ans = new ArrayList();
        add(root1);
        add(root2);
        Collections.sort(ans);
        return ans;
    }
}