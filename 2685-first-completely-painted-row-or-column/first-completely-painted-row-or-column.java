class Solution 
{
    public int firstCompleteIndex(int[] arr, int[][] mat) 
    {
        int m = mat.length, n = mat[0].length, l=m*n;
        int[] ind = new int[l+1];
        for(int i=0; i<l; i++)
            ind[arr[i]] = i;

        int min = l+1;
        for(int i=0; i<m; i++)
        {
            int max = 0;
            for(int j=0; j<n; j++)
                max = Math.max(max,ind[mat[i][j]]);
            min = Math.min(min, max);
        }
        for(int i=0; i<n; i++)
        {
            int max = 0;
            for(int j=0; j<m; j++)
                max = Math.max(max,ind[mat[j][i]]);
            min = Math.min(min, max);
        }
        return min;
    }
}