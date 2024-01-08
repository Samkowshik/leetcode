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
    static int fun(TreeNode root, int low, int high, int c)
    {
        
        if (root == null) return 0;
        System.out.println(root.val+" "+c);
        if (root.val >=low && root.val <= high) 
            c+=root.val;
        
        return fun(root.left, low, high, c) + fun(root.right, low, high, c);
    }
    public int rangeSumBST(TreeNode root, int low, int high)
    {
        // return fun(root, low, high, 0);
        int answer=0;
        if(root==null)return 0;
        if(root.val >=low && root.val <= high){
            answer+=root.val+rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);
        }else if(root.left!=null && root.left.val >=low && root.left.val <= high){
            answer+=rangeSumBST(root.left,low,high);
        }else if(root.right!=null && root.right.val >=low && root.right.val <= high){
            answer+=rangeSumBST(root.right,low,high);
        }else{
            answer+=rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);
        }
        return answer;
    }
}