class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int k = 0, n = nums.length;
        int j = 1;
        for(int i=1; i<n; i++)
        {
            while(i<n && nums[i-1]==nums[i])
            {
                i++;
                k++;
            }
            if(i!=n) nums[j++] = nums[i];
        }
        return n-k;
    }
}