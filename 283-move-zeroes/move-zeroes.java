class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int n = nums.length;
        for(int i=0; i<n; i++)
        {
            if(nums[i]!=0) continue;
            int j = i;
            while(j<n && nums[j]==0) j++;
            if(j==n) return;
            nums[i] = nums[j];
            nums[j] = 0;
        }
    }
}