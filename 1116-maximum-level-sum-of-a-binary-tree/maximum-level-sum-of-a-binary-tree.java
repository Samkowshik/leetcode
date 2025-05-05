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
    static void sam(TreeNode node, int i)
    {
        if(node == null) return;
        if(i == lst.size()) lst.add(node.val);
        else lst.set(i,lst.get(i)+node.val);
        sam(node.left, i+1);
        sam(node.right, i+1);
    }
    public int maxLevelSum(TreeNode root) 
    {
        lst = new ArrayList<>();
        sam(root,0);
        int max = Integer.MIN_VALUE, ans = 0;
        for(int i=0; i<lst.size(); i++)
        {
            if(lst.get(i)>max){
                max = lst.get(i);
                ans = i;
            }
        }
        return ans+1;
    }
}