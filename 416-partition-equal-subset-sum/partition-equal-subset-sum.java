class Solution 
{
    static Boolean dp[][];
    static boolean sam(int[] nums, int i, int sum, int csum)
    {
        if(i>=nums.length) return false;

        if(dp[csum][i]!= null)
        return dp[csum][i];

        if(csum*2 == sum) return true;

        return dp[csum][i] = sam(nums, i+1, sum, csum) || sam(nums, i+1, sum, csum+nums[i]);
    }
    
    public boolean canPartition(int[] nums) 
    {
        int sum = 0;
        for(int i: nums)
        sum += i;

        dp = new Boolean[20001][nums.length];
        return sam(nums, 0, sum, 0);
    }
}