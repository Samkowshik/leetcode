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
    public TreeNode addOneRow(TreeNode root, int val, int depth) 
    {
        if(depth == 1)
        {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(depth-->2)
        {
            int n = que.size();
            while(n-->0){
                TreeNode node = que.poll();
                if(node.left != null) que.add(node.left);
                if(node.right != null) que.add(node.right);
            }
        }

        while(!que.isEmpty())
        {
            TreeNode currNode = que.poll();
            TreeNode newLeft = new TreeNode(val);
            TreeNode newRight = new TreeNode(val);

            newLeft.left = currNode.left;
            newRight.right = currNode.right;
            currNode.left = newLeft;
            currNode.right = newRight;
        }

        return root;
    }
}