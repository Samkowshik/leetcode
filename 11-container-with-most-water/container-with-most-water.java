class Solution {
    public int maxArea(int[] nums) 
    {
        int ans =0, n= nums.length, i=0, j = n-1;
        while(i<j)
        {
            int min = Math.min(nums[i], nums[j]);
            ans = Math.max(ans, min*(j-i));

            if(nums[i] <= nums[j])
                i++;
            else
                j--;
        }
        return ans;
    }
}