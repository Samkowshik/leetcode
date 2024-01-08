class Solution {
    public int[] xorQueries(int[] arr, int[][] q)
    {
        int n = arr.length;
        int[][] mat = new int[n+1][31];
        for(int j=1; j<=n; j++)
        {
            for (int i=30; i>=0; i--)
            {
                mat[j][i] = mat[j-1][i] + (arr[j-1]&1);
                arr[j-1]>>=1;
            }
        }
        
        n = q.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++)
        {
            int l = q[i][0], r =q[i][1]+1, x=0;
            for (int j=30; j>=0; j--)
            {
                if((mat[r][j] - mat[l][j])%2 == 1)
                    x+=(int)Math.pow(2,30-j);
            }
            ans[i] = x;
        }
        for(int[] i: mat)
            System.out.println(Arrays.toString(i));
        return ans;
    }
}