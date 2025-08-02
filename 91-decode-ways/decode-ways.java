class Solution 
{
    int sam(char[] str, int i, int[] dp)
    {
        if(i >= str.length) return 1;
        if(str[i] == '0') return 0;

        if(dp[i] != -1) return dp[i];

        int p1 = sam(str, i+1, dp), p2 = 0;

        if(i!=str.length-1){
            int val = (str[i]-'0')*10 + (str[i+1]-'0');
            if(val <= 26)
            p2 = sam(str, i+2, dp);
        }
        return dp[i] = p1 + p2;
    }
    public int numDecodings(String s) 
    {
        char[] str = s.toCharArray();
        int[] dp = new int[str.length];
        Arrays.fill(dp, -1);
        return sam(str, 0, dp);
    }
}