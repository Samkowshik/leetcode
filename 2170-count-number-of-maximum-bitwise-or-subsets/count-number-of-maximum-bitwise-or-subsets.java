class Solution 
{
    int max;
    
    int sam(int[] nums, int i, int cur)
    {
        if(i == nums.length) return 0;

        int nonpick = sam(nums, i+1, cur);

        cur |= nums[i];

        if (cur == max) 
        return nonpick + (1<<nums.length-i-1);

        int pick = sam(nums, i+1, cur);

        return nonpick + pick ;
    }
    
    public int countMaxOrSubsets(int[] nums) 
    {
        max = 0;
        for (int i : nums) max |= i;

        return sam(nums, 0, 0);
    }
}