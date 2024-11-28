class Solution 
{
    static Map<Integer, List<Integer>> route;
    static int sam(int i, int n, int[] dp)
    {
        if(i==n) return 0;
        if(dp[i] != 0) return dp[i];
        
        int ans = 1+sam(i+1, n, dp);

        List<Integer> lst = route.getOrDefault(i, new ArrayList<>());
        for(Integer ele: lst)
            ans = Math.min(ans, 1+sam(ele,n,dp));
        
        return dp[i] = ans;
    }
    
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) 
    {
        int m = queries.length;
        int[] ans = new int[m];

        route = new HashMap<>();

        int i = 0;
        for(int[] q: queries)
        {
            List<Integer> lst = route.getOrDefault(q[0], new ArrayList<>());
            lst.add(q[1]);
            route.put(q[0], lst);

            ans[i++] = sam(0, n-1, new int[n]);
        }

        return ans;
    }
}