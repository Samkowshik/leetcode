class Solution 
{

    static int bs(int[] nums, int k)
    {
        int l = 0, r = nums.length-1, m = 0, ans = 0;
        while(l<=r)
        {
            m = (l+r)/2;
            if(nums[m]<=k)
            {
                l = m+1;
                ans = m;
            } 
            else r = m-1;
        }
        return ans;
    }
    public int maximumBeauty(int[] nums, int k) 
    {
        Arrays.sort(nums);
        int max = 0;
        for(int i=0; i<nums.length; i++)
        max = Math.max(max, bs(nums, nums[i]+2*k)-i+1);        

        return max;
    }
}