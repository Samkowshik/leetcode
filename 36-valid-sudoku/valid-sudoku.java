class Solution 
{
    static boolean row(char[][] sud, int i, int j)
    {
        int x = sud[i][j];
        for(int k=0; k<9; k++)
            if(k!=j && sud[i][k] == x)
                return false;
        return true;
    }
    static boolean col(char[][] sud, int i, int j)
    {
        int x = sud[i][j];
        for(int k=0; k<9; k++)
            if(k!=i && sud[k][j] == x)
                return false;
        return true;
    }
    static boolean box(char[][] sud, int i, int j)
    {
        int m = i-i%3, n = j-j%3, x = sud[i][j];
        for(int k=m; k<m+3; k++)
        for(int l=n; l<n+3; l++)
            if(!(k==i && l==j) && sud[k][l]==x)
                return false;
        return true;
    }
    public boolean isValidSudoku(char[][] sud) 
    {
        for(int i=0; i<9; i++)
        for(int j=0; j<9; j++)
        {
            if(sud[i][j]=='.') continue;
            if(!(row(sud,i,j) && col(sud,i,j) && box(sud,i,j)))
                return false;
        }

        return true;
    }
}