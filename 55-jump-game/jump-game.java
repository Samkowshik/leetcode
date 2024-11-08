class Solution 
{
    public boolean canJump(int[] nums) 
    {
        boolean ans = true;
        int t = 1;
        for(int i=nums.length-2; i>=0; i--)
        {
            if(nums[i]>=t)
            {
                t = 1;
                ans = true;
            }
            else
            {
                t++;
                ans = false;
            }
        }

        return ans;
    }
}