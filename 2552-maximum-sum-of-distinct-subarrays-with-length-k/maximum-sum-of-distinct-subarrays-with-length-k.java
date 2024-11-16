class Solution {
    public long maximumSubarraySum(int[] nums, int k) 
    {
        boolean[] vis = new boolean[100001];
        long ans = 0, sum =0;
        int j=0;

        for(int i=0; i<nums.length; i++)
        {
            sum+=nums[i];
            while(vis[nums[i]])
            {
                sum-=nums[j];
                vis[nums[j++]] = false;
            }

            if(i-j==k-1)
            {
                ans = Math.max(ans, sum);
                sum -= nums[j];
                vis[nums[j++]] = false;
            }
            vis[nums[i]] = true;
        }

        return ans;
    }
}