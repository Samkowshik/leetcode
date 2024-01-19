class Solution 
{
    public int minFallingPathSum(int[][] mat) 
    {
        int n = mat.length;
        int[][] ans = new int[n][n];
        
        for(int j=0; j<n; j++) ans[n-1][j] = mat[n-1][j];
        
        for(int i=n-2; i>-1; i--)
        for(int j =0; j<n; j++)
        {
            int val = ans[i+1][j];
            if(j>0)
                val = Math.min(val, ans[i+1][j-1]);
            if(j<n-1)
                val = Math.min(val, ans[i+1][j+1]);
            ans[i][j] = mat[i][j]+val;
        }
        
        int a = 100001;
        for(int i=0; i<n; i++) a = Math.min(a,ans[0][i]);
        return a;
    }
}