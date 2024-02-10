class Solution 
{
    static int ans;
    static int pal(char[] arr, int[][] dp, int i, int j)
    {
        if(i>=j) return 1;
        if(arr[i] != arr[j]) return -1;

        dp[i][j] = pal(arr,dp,i+1,j-1);
        if(dp[i][j]==1) ans++;
        return dp[i][j];
    }
    public int countSubstrings(String s) 
    {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int[][] dp = new int[n][n];

        ans =n;
        for(int i=0; i<n; i++)
        for(int j=i+1; j<n; j++)
        if(dp[i][j]==0)
        dp[i][j] = pal(arr,dp,i,j);

        return ans;
    }
}