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
class Solution {
    public TreeNode insertIntoMaxTree(TreeNode root, int val)
    {
        TreeNode ansNode = new TreeNode(val);
        if(root.val<val)
        {
            ansNode.left = root;
            return ansNode;
        }
        TreeNode prevNode = root, curr = root.right;
        while(curr != null)
        {
            if(curr.val<val)
            {
                prevNode.right = ansNode;
                ansNode.left = curr;
                return root;
            }
            prevNode = curr;
            curr = curr.right;
        }
        prevNode.right = ansNode;
        return root;
    }
}