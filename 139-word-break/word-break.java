class Solution 
{
    static Boolean[][] dp;
    static String str;

    static boolean fun(String s, int i, int j, List<String> dict)
    {
        if(dict.contains(s)) return true;
        
        if(dp[i][j]!= null) return dp[i][j];

        boolean f = false;
        for(int k=i+1; !f && k<j; k++)
        {
            String s1 = str.substring(i,k);
            String s2 = str.substring(k);
            if(fun(s1, i, k, dict) && fun(s2, k, j, dict))
                f = true;
        }
        return dp[i][j] = f;
    }
    public boolean wordBreak(String s, List<String> dict) 
    {
        int n = s.length();
        dp = new Boolean[n+1][n+1];
        str = s;

        return fun(s, 0, n, dict);
    }
}