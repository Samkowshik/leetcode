class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int n = nums.length, c=1, j=1;
        for(int i=1; i<n; i++)
        {
            c = 1 + (nums[i]==nums[i-1]? c: 0);
            if(c<3) nums[j++] = nums[i];
        }
        return j;
    }
}