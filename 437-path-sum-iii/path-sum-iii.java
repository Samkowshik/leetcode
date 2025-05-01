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
    static List<Long> lst;
    static int sam(TreeNode node, int t)
    {
        if(node == null) return 0;
        int ans = node.val == t ? 1:0;

        for(int i=0; i<lst.size(); i++) 
        {
            lst.set(i, lst.get(i)+node.val);
            if(lst.get(i)==t) ans++;
        }
        lst.add(Long.valueOf(node.val));

        ans += sam(node.left, t) + sam(node.right, t);

        for(int i=0; i<lst.size(); i++) 
            lst.set(i, lst.get(i)-node.val);
        lst.remove(lst.size()-1);

        return ans;
    }
    public int pathSum(TreeNode root, int targetSum) 
    {
        lst = new ArrayList<>();
        return sam(root, targetSum);
    }
}