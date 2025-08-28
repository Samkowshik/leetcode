class Solution {
    public int[][] diagonalSort(int[][] grid) 
    {
        int m = grid.length, n = grid[0].length;
        if(m==1 || n==1) return grid;

        int[] arr = new int[Math.max(m,n)];

        for(int i=0; i<m; i++)
        {
            int ind = 0;
            for(int j=0; i+j<m && j<n; j++)
                arr[ind++] = grid[i+j][j];

            Arrays.sort(arr,0,ind);

            for(int j=0; i+j<m && j<n; j++)
                grid[i+j][j] = arr[j];
        }

        for(int i=1; i<n; i++)
        {
            int ind = 0;
            for(int j=0; j<m && i+j<n; j++)
                arr[ind++] = grid[j][i+j];

            Arrays.sort(arr,0,ind);

            for(int j=0; j<m && i+j<n; j++)
            grid[j][i+j] = arr[j];
        }

        return grid;
        
    }
}