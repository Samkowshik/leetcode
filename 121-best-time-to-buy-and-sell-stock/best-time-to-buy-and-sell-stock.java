class Solution {
    public int maxProfit(int[] nums) 
    {
        int max = 0, min = nums[0];
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]<min) min = nums[i];
            else max = Math.max(max, nums[i]-min);
        }
        return max;
    }
}