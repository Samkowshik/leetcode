class Solution {
    public int minimumArea(int[][] grid) {
        int top = -1, left = grid[0].length, bottom = -1, right = -1;
        for(int i=0; i<grid.length; i++)
        for(int j=0; j<grid[0].length; j++)
        if(grid[i][j] == 1)
        {
            if(top == -1) top = i;
            left = Math.min(left, j);
            bottom = i;
            right = Math.max(right, j);
        }

        // System.out.println(top+" "+left+" "+bottom+" "+right);

        return (bottom-top+1)*(right-left+1);

    }
}