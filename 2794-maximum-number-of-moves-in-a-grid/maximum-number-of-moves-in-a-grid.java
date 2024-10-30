class Solution 
{
    public int maxMoves(int[][] mat) 
    {
        int n = mat.length, m = mat[0].length;

        boolean[][] ans = new boolean[n][m];
        for(int i=0; i<n; i++) ans[i][0] = true;

        for(int j=1; j<m; j++)
        {
            boolean f = true;
            for(int i=0; i<n; i++)
            {
                boolean a,b,c;
                a = ans[i][j-1] && mat[i][j] > mat[i][j-1];
                b = i>0 && ans[i-1][j-1] && mat[i][j] > mat[i-1][j-1];
                c = i<n-1 && ans[i+1][j-1] && mat[i][j] > mat[i+1][j-1];

                if(a || b || c)
                {
                    ans[i][j] = true;
                    f = false;
                }
            }

            if(f) return j-1;
        }
        return m-1;
    }
}