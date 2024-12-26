class Solution 
{
    public int findTargetSumWays(int[] nums, int target) 
    {
        int n = nums.length;
        int[] dp = new int[1<<n];

        for(int i: nums) dp[0]+=i;
        dp[1] = dp[0]-2*nums[n-1];

        int ans = 0;
        if(target == dp[0]) ans++;
        if(target == dp[1]) ans++;

        for(int i=2; i<(1<<n); i++)
        {
            int msb = (int)(Math.log(i) / Math.log(2));
            int j = i^(1<<msb);
            dp[i] = dp[j] - 2*nums[n-msb-1];

            if(target == dp[i])
                ans++;
        }
        
        return ans;
    }
}