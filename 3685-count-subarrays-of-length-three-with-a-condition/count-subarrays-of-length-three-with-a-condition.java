class Solution 
{
    public int countSubarrays(int[] nums) 
    {
        int ans = 0;
        for(int i=2; i<nums.length; i++)
        if(nums[i-1]==(nums[i-2]+nums[i])*2)
        ans++;
        return ans;
    }
}