class Solution 
{
    public int longestCommonSubsequence(String text1, String text2) 
    {
        char[] s1 = text1.toCharArray();
        char[] s2 = text2.toCharArray();
        int n = s1.length, m = s2.length;
        int[][]  ans = new int[n+1][m+1];

        for(int i=1; i<=n; i++)
        for(int j=1; j<=m; j++)
        if(s1[i-1]==s2[j-1]) ans[i][j] = ans[i-1][j-1]+1;
        else ans[i][j] = Math.max(ans[i-1][j], ans[i][j-1]);
        
        return ans[n][m];
    }
}