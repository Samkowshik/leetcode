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
    int findMax(int[] nums, int l, int r)
    {
        int maxi = l;
        for(int i=l; i<r; i++)
            if(nums[i]>nums[maxi])
                maxi = i;
        return maxi;
    }
    TreeNode helper(int[] nums, int l, int r)
    {
        if(l==r) return null;

        int ind = findMax(nums, l, r);

        TreeNode node = new TreeNode(nums[ind]);
        node.left = helper(nums, l, ind);
        node.right =helper(nums, ind+1, r);

        return node;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) 
    {
        return helper(nums, 0, nums.length);    
    }
}