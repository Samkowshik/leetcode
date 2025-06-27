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
    int find(TreeNode root, int d)
    {
        if(root == null) return d;
        return Math.max(find(root.left, d+1), find(root.right, d+1));
    } 

    void print(TreeNode root, int row, int l, int r, String[][] ans)
    {
        if(root == null)return;

        int m = (l+r)/2;
        ans[row][m] = Integer.toString(root.val);

        print(root.left, row+1, l, m, ans); 
        print(root.right,row+1, m, r, ans); 
    }


    public List<List<String>> printTree(TreeNode root) 
    {
        int m = find(root, 0), n = (1<<m)-1;
        String[][] ans = new String[m][n];
        
        print(root, 0, 0, n, ans);

        List<List<String>> ansList = new ArrayList<>();
        for(String[] arr: ans)
        {
            List<String> innerList = new ArrayList<>();
            for(String s : arr)
                innerList.add(s==null? "":s);
            ansList.add(innerList);
        }

        return ansList;
    }
}