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
    static Queue<TreeNode> nlst;
    static Queue<Boolean> dir;
    
    static int finddep(TreeNode node)
    {
        if(node == null) return -1;
        return Math.max(finddep(node.left), finddep(node.right))+1;
    }
    
    static boolean findt(TreeNode node, int t)
    {
        if(node == null) return false;
        if(node.val == t)
        {
            nlst.add(node);
            return true;
        }
        boolean left = findt(node.left, t);
        boolean right = findt(node.right, t);
        
        if(left || right)
        {
            nlst.add(node);
            dir.add(left);
        }
        
        return left || right;
    }
    public int amountOfTime(TreeNode root, int t) 
    {
        nlst = new LinkedList<>();
        dir = new LinkedList<>();
        
        findt(root, t);
        
        int max = finddep(nlst.poll()), c=1;
        for(TreeNode node: nlst)
        {
            if(dir.poll()) node.left = null;
            else node.right = null;
            
            max = Math.max(max, finddep(node)+c++);
        }

        return max;
    }
}