class Solution {
    public int[] findDiagonalOrder(int[][] mat) 
    {
        int m = mat.length, n = mat[0].length, row = 0, col = 0, ind = 0;
        int[] ans = new int[m*n];

        for(int i=0; i<m+n-1; i++)
        {
            if(i%2==0){
                row = Math.min(m-1,i);
                col = i-row;
                while(row>=0 && col<n)
                    ans[ind++] = mat[row--][col++];
            }
            else{
                col = Math.min(n-1,i);
                row = i-col;
                while(row<m && col>=0)
                    ans[ind++] = mat[row++][col--];
            }
        }
        
        return ans;
    }
}