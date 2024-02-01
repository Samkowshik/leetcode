class Solution 
{
    static int fun(int[][] mat,int n, int m)
    {
        for(int i=m-2; i>=0; i--)
        for(int j=n-2; j>=0; j--)
        {
            if(mat[j][i]==1)
            {
                mat[j][i] = 0;
                continue;
            }
            mat[j][i] = mat[j][i+1]+mat[j+1][i];
        }
        return mat[0][0];
    }

    public int uniquePathsWithObstacles(int[][] mat) 
    {
        int n = mat.length, m= mat[0].length;
        if(mat[0][0]==1 || mat[n-1][m-1]==1) return 0;

        boolean f = true;
        for(int i=m-1; i>=0; i--)
        {
            if(mat[n-1][i]==1) f = false;
            if(f) mat[n-1][i] = 1;
            else mat[n-1][i] = 0;
        }
        f = true;
        for(int i=n-2; i>=0; i--)
        {
            if(mat[i][m-1]==1)  f = false;
            if(f) mat[i][m-1] = 1;
            else mat[i][m-1] = 0;
        }
        return fun(mat,n,m);
    }
}