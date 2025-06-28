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
    public TreeNode createBinaryTree(int[][] descriptions) 
    {
        Map<Integer, TreeNode> map = new HashMap<>();
        Map<Integer, Boolean> isRoot = new HashMap<>();

        for(int[] des : descriptions)
        {
            TreeNode pNode = map.get(des[0]);
            if(pNode == null){
                pNode = new TreeNode(des[0]);
            }
            TreeNode cNode = map.get(des[1]);
            if(cNode == null){
                cNode = new TreeNode(des[1]);
                map.put(des[1], cNode);
            }
            if(des[2]==1)
                pNode.left = cNode;
            else
                pNode.right = cNode;
            map.put(des[0], pNode);

            if(isRoot.get(des[0]) == null)
            isRoot.put(des[0], true);
            isRoot.put(des[1], false);
            
        }
        for (Integer key : isRoot.keySet())
            if(isRoot.get(key))
                return map.get(key);
        return null;
    }
}