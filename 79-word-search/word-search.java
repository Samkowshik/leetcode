class Solution 
{
    static boolean[][] trace;
    static boolean doExist(char[][] board, String word, int i, int j, int ind)
    {
        if(ind == word.length()) return true;
        if(i<0 || j<0 || i==board.length || j==board[0].length || trace[i][j] || word.charAt(ind) != board[i][j])
            return false;

        trace[i][j] = true;
        boolean f = doExist(board, word, i-1, j, ind+1) || doExist(board, word, i, j+1, ind+1) || doExist(board, word, i+1, j, ind+1) || doExist(board, word, i, j-1, ind+1);
        trace[i][j] = false;

        return f;
    }
    public boolean exist(char[][] board, String word) 
    {
        trace = new boolean[board.length][board[0].length];

        for(int i=0; i<board.length; i++)
            for(int j=0; j<board[0].length; j++)
                if(word.charAt(0) == board[i][j] && doExist(board, word, i, j, 0))
                    return true;

        return false;
    }
}