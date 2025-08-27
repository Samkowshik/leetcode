class Solution 
{
    int sam(int[][] grid, int i, int j, int cur, int dir, boolean turn)
    {
        if(i<0 || i==grid.length || j<0 || j==grid[0].length || grid[i][j] ==1 || grid[i][j] == (cur%2 == 0? 0:2)) {
            return cur;
        }

        int sides = 0, line = 0;
        if(dir == 1){
            if(turn)
            sides = sam(grid, i-1, j+1, cur+1, 2, false);
            line = sam(grid, i-1, j-1, cur+1, 1, turn);
            return Math.max(sides,line);
        }
        else if(dir == 2){
            if(turn)
            sides = sam(grid, i+1, j+1, cur+1, 4, false);
            line = sam(grid, i-1, j+1, cur+1, 2, turn);
            return Math.max(sides,line);
        }
        else if(dir == 3){
            if(turn)
            sides = sam(grid, i-1, j-1, cur+1, 1, false);
            line = sam(grid, i+1, j-1, cur+1, 3, turn);
            return Math.max(sides,line);
        }
        else{
            if(turn)
            sides = sam(grid, i+1, j-1, cur+1, 3, false);
            line = sam(grid, i+1, j+1, cur+1, 4, turn);
            // System.out.println(i+" "+j+" "+sides+" "+line);
            return Math.max(sides,line);
        }

    }
    public int lenOfVDiagonal(int[][] grid) 
    {
        int max = -1, m = grid.length, n = grid[0].length;
        for(int i=0; i<m; i++)
        for(int j=0; j<n; j++)
        if(grid[i][j] == 1){
            max = Math.max(max, sam(grid, i-1, j-1, 0, 1, true));
            max = Math.max(max, sam(grid, i-1, j+1, 0, 2, true));
            max = Math.max(max, sam(grid, i+1, j-1, 0, 3, true));
            max = Math.max(max, sam(grid, i+1, j+1, 0, 4, true));
            // System.out.println();
        }

        return max+1;
    }
}