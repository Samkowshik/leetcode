

public class Solution 
{
    boolean[][] rowMap = new boolean[9][9];
    boolean[][] colMap = new boolean[9][9];
    boolean[][] boxMap = new boolean[9][9];


    boolean solve(char[][] board)
    {
        for(int i=0; i<9; i++) 
        for(int j=0; j<9; j++) 
        if(board[i][j] == '.')
        {
            for(int k=1; k<10; k++)
            {
                if(!(rowMap[i][k-1] || colMap[j][k-1] || boxMap[(i/3)*3+(j/3)][k-1]))
                {
                    
                    board[i][j] = (char)('0'+k);
                    rowMap[i][k-1] = true;
                    colMap[j][k-1] = true;
                    boxMap[(i/3)*3+(j/3)][k-1] = true;
                    
                    
                    if(solve(board))
                        return true;
                    
                    board[i][j] = '.';
                    rowMap[i][k-1] = false;
                    colMap[j][k-1] = false;
                    boxMap[(i/3)*3+(j/3)][k-1] = false;
                }
            }
            if(board[i][j] == '.')
                return false;
        }


        return true;
    }

    public void solveSudoku(char[][] board) 
    {
        

        for(int i=0; i<9; i++)
        for(int j=0; j<9; j++)
        if(board[i][j] != '.'){
            int ind = board[i][j]-'0'-1;
            rowMap[i][ind] = true;
            colMap[j][ind] = true;
            boxMap[(i/3)*3+(j/3)][ind] = true;
        }

        solve(board);
    }
}
