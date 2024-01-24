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
    static int ans;
    static boolean isval(int[] arr)
    {
        int c=0;
        for(int i: arr)
            if(i%2==1) c++;
        return c<2;
    }
    
    static void fun(TreeNode root, int[] arr)
    {
        if(root == null) return;
        
        arr[root.val]++;
        if(root.left == null && root.right == null && isval(arr))
            ans++;;
        
        fun(root.left, arr);
        fun(root.right, arr);
        arr[root.val]--;
    }
    public int pseudoPalindromicPaths (TreeNode root) 
    {
        ans = 0;
        int[] arr = new int[10];
        fun(root, arr);
        return ans;
    }
}