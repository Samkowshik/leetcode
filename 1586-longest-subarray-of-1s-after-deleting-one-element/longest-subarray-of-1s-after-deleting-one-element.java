class Solution 
{
    int consec(int[] nums, int i)
    {
        int j = i;
        while(j<nums.length && nums[i]==nums[j])
            j++;
        return j;
    }

    public int longestSubarray(int[] nums) 
    {
        int n = nums.length, max = 0;
        if(consec(nums, 0) == n)
        return nums[0] == 0? 0 : n-1;

        int i = 0, j = 0;
        while(i<n)
        {
            j = consec(nums, i);
            if(nums[i] == 1){
                max = Math.max(max,j-i);

                if(j<n-1 && nums[j]==0 && nums[j+1] == 1){
                    max = Math.max(max, consec(nums, j+1)-i-1);
                }
            }
            i = j;
        }

        return max;
    }
}