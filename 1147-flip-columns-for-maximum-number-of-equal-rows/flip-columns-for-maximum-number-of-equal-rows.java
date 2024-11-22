class Solution 
{
    static boolean xor(int[] a, int[] b)
    {
        boolean f = a[0]==b[0];
        for(int i=1; i<a.length; i++)
            if((a[i]==b[i])!=f)
                return false;
        return true;
    }
    public int maxEqualRowsAfterFlips(int[][] mat) 
    {
        int n = mat.length, m = mat[0].length, c, ans = 0;
        boolean[] f = new boolean[n];
        for(int i=0; i<n-ans; i++)
        {
            if(f[i]) continue;

            c = 1;
            for(int j=i+1; j<n; j++)
                if(xor(mat[i],mat[j]))
                {
                    c++;
                    f[j] = true;
                }
            ans = Math.max(ans,c);
        }
        return ans;
    }
}