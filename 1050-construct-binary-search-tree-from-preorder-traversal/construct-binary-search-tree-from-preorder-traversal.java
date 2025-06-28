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
    int findInd(int[] nums, int i)
    {
        for(int j=i; j<nums.length; j++)
            if(nums[j]>nums[i])
                return j;
        return -1;
    }
    TreeNode helper(int[] nums, int l, int r)
    {
        if(l<0 || l==nums.length || l==r) return null;

        TreeNode node = new TreeNode(nums[l]);

        int ind = findInd(nums, l);
        node.left = helper(nums, l+1, ind);
        node.right = helper(nums, ind, r);

        return node;
    }
    public TreeNode bstFromPreorder(int[] nums) 
    {
        return helper(nums, 0, nums.length);
    }
}