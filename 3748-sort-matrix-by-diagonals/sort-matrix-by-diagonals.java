class Solution {
    public int[][] sortMatrix(int[][] grid) 
    {
        int n = grid.length;
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i; j++)
            arr[j] = grid[i+j][j];

            Arrays.sort(arr,0,n-i);

            for(int j=0; j<n-i; j++)
            grid[i+j][j] = arr[n-i-j-1];
        }

        for(int i=1; i<n; i++)
        {
            for(int j=0; j<n-i; j++)
            arr[j] = grid[j][i+j];

            Arrays.sort(arr,0,n-i);

            for(int j=0; j<n-i; j++)
            grid[j][i+j] = arr[j];
        }

        return grid;
    }
}