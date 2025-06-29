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
    int max;
    List<Integer> helper(TreeNode root)
    {
        if(root == null) return new ArrayList<>();

        List<Integer> subs = new ArrayList<>();
        subs.addAll(helper(root.left));
        subs.addAll(helper(root.right));
        if(subs.size() == 0)
        {
            subs.add(root.val);
            subs.add(root.val);
            return subs;
        }
        Collections.sort(subs);
        // System.out.println(root.val+" "+subs);
        if(subs.size() == 4){
            subs.remove(1);
            subs.remove(1);
        }
        max = Math.max(max, Math.abs(root.val-subs.get(0)));
        max = Math.max(max, Math.abs(root.val-subs.get(1)));

        subs.add(root.val);
        Collections.sort(subs);
        subs.remove(1);

        return subs;
    }
    public int maxAncestorDiff(TreeNode root) 
    {
        max = 0;
        helper(root);
        return max;        
    }
}