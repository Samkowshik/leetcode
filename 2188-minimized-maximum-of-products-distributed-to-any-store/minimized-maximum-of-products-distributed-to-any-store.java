class Solution 
{
    static int max(int[] nums)
    {
        int max =0;
        for(int i: nums)
            max = Math.max(max,i);
        return max;
    }
    static boolean sam(int[] nums, int n, int x)
    {
        for(int i: nums)
        {
            n -= (i/x) + (i%x == 0 ? 0:1);
            if(n<0) return false;
        }
        return true;
    }
    public int minimizedMaximum(int n, int[] nums) 
    {
        int mid, l =1, r = max(nums), ans = 0;

        while(l<=r)
        {
            mid = (l+r)/2;
            if(sam(nums, n, mid))
            {
                ans = mid;
                r = mid-1;
            }
            else
                l = mid+1;
        }

        return ans;
    }
}