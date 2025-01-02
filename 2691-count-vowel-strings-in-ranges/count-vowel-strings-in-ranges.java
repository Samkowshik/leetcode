class Solution
{
    static String vls = "aeiou";
    static int sam(String s)
    {
        String x = s.substring(0,1);
        String y = s.substring(s.length()-1);
        return vls.contains(x) && vls.contains(y)? 1:0;
    }
    public int[] vowelStrings(String[] words, int[][] q) 
    {
        int n = q.length, m = words.length;
        int[] ans = new int[n];
        int[] arr = new int[m+1];

        for(int i=1; i<=m; i++)
            arr[i] = arr[i-1] + sam(words[i-1]);
        
        for(int i=0; i<n; i++)
            ans[i] = arr[q[i][1]+1]-arr[q[i][0]];

        return ans;
    }
}