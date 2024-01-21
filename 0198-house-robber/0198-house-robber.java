class Solution 
{
    static int n;
    static int[] dp;
    static int fun(int[] arr, int i)
    {
        if(i>=n) return 0;
        if(dp[i]==-1)
        dp[i] = arr[i]+Math.max(fun(arr,i+2),fun(arr,i+3));
        return dp[i];
    }
    public int rob(int[] arr)
    {
        n = arr.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.max(fun(arr,0),fun(arr,1));
    }
}