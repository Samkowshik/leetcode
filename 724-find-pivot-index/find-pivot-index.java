class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int sum = 0, cur = 0;
        for(int i : nums) sum+=i;
        for(int i=0; i<nums.length; i++)
        {
            if(cur == sum-cur-nums[i])
                return i;
            cur+=nums[i];
        }
        return -1;
    }
}