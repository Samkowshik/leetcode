class Solution 
{
    public boolean check(int[] nums) 
    {
        int n = nums.length-1;
        if(n==0) return true;

        int i = n-1;
        while(i>=0 && nums[i] <= nums[i+1]) i--;
        if(i<0) return true;

        if(nums[i]<nums[n]) return false;
        i--;
        while(i>=0 && nums[i] <= nums[i+1] && nums[i]>=nums[n]) i--;

        return i<0;
    }
}