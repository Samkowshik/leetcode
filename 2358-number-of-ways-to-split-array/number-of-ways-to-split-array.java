class Solution 
{
    public int waysToSplitArray(int[] nums)
    {
        long tsum = 0, csum = 0;
        int ans = 0;
    
        for(int i : nums)tsum += i;
        for(int i=0; i<nums.length-1; i++)
        {
            csum += nums[i];
            if(csum >= tsum-csum)
                ans++;
        }
        return ans;
    }
}