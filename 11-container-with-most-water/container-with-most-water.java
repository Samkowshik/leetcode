class Solution {
    public int maxArea(int[] nums) 
    {
        int dup, ans =0, n= nums.length, i=0, j = n-1;
        while(i<j)
        {
            int min = Math.min(nums[i], nums[j]);
            ans = Math.max(ans, min*(j-i));

            if(nums[i] <= nums[j])
            {
                dup = nums[i];
                while(i<n && nums[i] <= dup) i++;
            }
            else
            {
                dup = nums[j];
                while(j>0 && nums[j] <= dup) j--;
            }
        }
        return ans;
    }
}