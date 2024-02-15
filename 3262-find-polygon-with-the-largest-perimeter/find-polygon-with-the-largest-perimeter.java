class Solution {
    public long largestPerimeter(int[] nums) 
    {
        Arrays.sort(nums);
        long ans = -1, prv = nums[0]+nums[1];
        for(int i =2; i<nums.length; i++)
        {
            if(prv>nums[i]) ans = prv+nums[i];
            prv +=nums[i];
        }
        return ans;
    }
}