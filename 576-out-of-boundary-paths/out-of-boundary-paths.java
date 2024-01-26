class Solution 
{
    static int[][][] dp;
    static int mod = (int)(1e9+7);
    static int fun(int n, int m, int k, int i, int j)
    {
        if(k<0) return 0;
        if(i<0 ||j<0 || i==n || j==m ){
            return 1;
        }
        int a=0,b=0,c=0,d=0;

        if(i==0 || k==0 || dp[i-1][j][k-1] == -1)
        a = fun(n,m,k-1,i-1,j);
        else
        a = dp[i-1][j][k-1];

        if(i==n-1 || k==0 || dp[i+1][j][k-1]== -1)
        b = fun(n,m,k-1,i+1,j);
        else
        b = dp[i+1][j][k-1];

        if(j==0 || k==0 || dp[i][j-1][k-1] == -1)
        c =fun(n,m,k-1,i,j-1);
        else
        c = dp[i][j-1][k-1];
        
        if(j==m-1 || k==0 || dp[i][j+1][k-1]== -1)
        d = fun(n,m,k-1,i,j+1);
        else
        d = dp[i][j+1][k-1];

        dp[i][j][k] = ((a+b)%mod+(c+d)%mod)%mod;
        return dp[i][j][k];
    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) 
    {
        dp = new int[m][n][maxMove+1];
        for(int[][] i: dp)
        for(int[] j : i)
        Arrays.fill(j,-1);

        return fun(m,n,maxMove,startRow,startColumn);
    }
}