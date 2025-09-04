class Solution 
{
    public int maxIncreaseKeepingSkyline(int[][] grid) 
    {
        int n = grid.length;
        int[] rowMax = new int[n];
        int[] colMax = new int[n];

        for(int i=0; i<n; i++){
            int max = 0;
            for(int j=0; j<n; j++)
            max = Math.max(max, grid[i][j]);
            rowMax[i] = max;
        }
        for(int i=0; i<n; i++){
            int max = 0;
            for(int j=0; j<n; j++)
            max = Math.max(max, grid[j][i]);
            colMax[i] = max;
        }

        int ans = 0, val = 0;
        for(int i=0; i<n; i++)
        for(int j=0; j<n; j++){
            val = Math.min(rowMax[i], colMax[j]) - grid[i][j];
            if(val > 0)
                ans += val;
        }
        return ans;
    }
}