class Solution {
    public int[] getMaximumXor(int[] nums, int maxBit) 
    {
        int n = nums.length;
        int[] ans = new int[n];
        int max = (1<<maxBit)-1, cur = 0;
        
        for(int i=0; i<n; i++)
        {
            cur ^= nums[i];
            ans[n-i-1] = cur ^ max;
        }
        return ans;
    }
}