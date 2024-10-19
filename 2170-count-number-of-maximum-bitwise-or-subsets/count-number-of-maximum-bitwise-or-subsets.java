class Solution 
{
    static int sam(int[] nums, int n, int i, int max, int cur)
    {
        if(i == n) return 0;

        int nonpick = sam(nums, n, i+1, max, cur);

        cur |= nums[i];

        if (cur == max) 
        return nonpick + (1<<n-i-1);

        int pick = sam(nums, n, i+1, max, cur);

        return nonpick + pick ;
    }
    
    public int countMaxOrSubsets(int[] nums) 
    {
        int max = 0;
        for (int i : nums) max |= i;

        return sam(nums, nums.length, 0, max, 0);
    }
}