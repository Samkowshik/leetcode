class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) 
    {
        int[][] mat = new int[m][n];

        int ans = m*n-guards.length-walls.length,val;
        if(0 == ans) return 0;

        for(int[] w: walls)
            mat[w[0]][w[1]] = -1;
        for(int[] g: guards)
            mat[g[0]][g[1]] = -1;
        
        for(int[] g: guards)
        {
            for(int i=g[0]+1; i<m; i++)
            {
                val = mat[i][g[1]];
                if(val < 0) break;
                if(val == 0){
                    mat[i][g[1]] = 1;
                    ans--;
                }
            }

            for(int i=g[0]-1; i>=0; i--)
            {
                val = mat[i][g[1]];
                if(val < 0) break;
                if(val == 0){
                    mat[i][g[1]] = 1;
                    ans--;
                }
            }

            for(int i=g[1]+1; i<n; i++)
            {
                val = mat[g[0]][i];
                if(val < 0) break;
                if(val == 0){
                    mat[g[0]][i] = 1;
                    ans--;
                }
            }
            
            for(int i=g[1]-1; i>=0; i--)
            {
                val = mat[g[0]][i];
                if(val < 0) break;
                if(val == 0){
                    mat[g[0]][i] = 1;
                    ans--;
                }
            }

        }
        return ans;
        
    }
}