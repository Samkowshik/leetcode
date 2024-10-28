class Solution 
{
    static int ans;
    static int[][][] dp;
    static boolean sam(int[][] mat,int m, int n, int i, int j, int k)
    {
        if(i == m || j == n) return false;
        if(k == 1 ) return mat[i][j] == 1;

        if(dp[i][j][k] == 1) return true;
        if(dp[i][j][k] == -1) return false;

        boolean a,b,c,d;
        a = dp[i][j][k-1] == 1 ? true : sam(mat, m, n, i, j, k-1);
        b = dp[i][j+1][k-1] == 1 ? true : sam(mat, m, n, i, j+1, k-1);
        c = dp[i+1][j][k-1] == 1 ? true : sam(mat, m, n, i+1, j, k-1);
        d = dp[i+1][j+1][k-1] == 1 ? true : sam(mat, m, n, i+1, j+1, k-1);
        
        if(a && b && c && d)
        {
            ans++;
            dp[i][j][k] = 1;
            return true;
        }
        dp[i][j][k] = -1;
        return false;
    }
    static int count(int[][] mat)
    {
        int ones = 0;
        for(int[] i : mat)
            for(int j: i)
                if(j == 1)
                    ones++;

        return ones; 
    }
    public int countSquares(int[][] mat) 
    {
        int m = mat.length, n = mat[0].length, k =  Math.max(m,n);
        dp = new int[m+1][n+1][k+1];
        ans = 0;
        
        sam(mat, m, n, 0, 0, k);

        return ans+count(mat);
    }
}