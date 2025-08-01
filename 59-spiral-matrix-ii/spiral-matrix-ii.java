class Solution 
{
    int k;
    void sam(int[][] mat, int m1, int n1, int m2, int n2)
    {
        if(m1 > m2 || n1 > n2) return;
        for(int i=n1; i<=n2; i++)
            mat[m1][i] = k++;
        for(int i=m1+1; i<=m2; i++)
            mat[i][n2] = k++;

        if(m1 != m2)
        for(int i=n2-1; i>n1; i--)
            mat[m2][i] = k++;
            
        if(n1 != n2)
        for(int i=m2; i>m1 ; i--)
            mat[i][n1] = k++;

        sam(mat, m1+1, n1+1, m2-1, n2-1);
    }

    public int[][] generateMatrix(int n) 
    {
        int[][] mat = new int[n][n];
        k = 1;
        sam(mat, 0, 0, n-1, n-1);
        return mat;
    }
}