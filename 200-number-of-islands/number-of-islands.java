class Solution {
    static int[][] val = {{-1,0},{0,1},{1,0},{0,-1}};
    static void fun(int n, int m, char[][] mat, int i, int j)
    {
        if(i<0 || j<0 || i==n || j==m || mat[i][j]=='0') return;
        
        mat[i][j] = '0';
        for(int v=0; v<4; v++)
        fun(n,m,mat,i+val[v][0],j+val[v][1]);
    }
    public int numIslands(char[][] mat) 
    {
        int ans = 0, n = mat.length, m = mat[0].length;
        for(int i=0; i<n; i++)
        for(int j=0; j<m; j++)
        if(mat[i][j]=='1')
        {
            fun(n,m,mat,i,j);
            ans++;
        }

        return ans;
    }
}