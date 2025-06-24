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
    public List<List<Integer>> levelOrderBottom(TreeNode root) 
    {
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null) return ans; 

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty())
        {
            List<Integer> lst = new ArrayList<>();

            int n = que.size();
            while(n-->0)
            {
                TreeNode node = que.poll();
                lst.add(node.val);
                if(node.left!=null) que.add(node.left);
                if(node.right!=null) que.add(node.right);
            }
            ans.add(0,lst);
        }

        return ans;
    }
}