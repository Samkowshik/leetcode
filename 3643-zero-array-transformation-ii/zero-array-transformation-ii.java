class Solution 
{
    static boolean check(int[] nums)
    {
        for(int i: nums)
            if(i!=0)
                return false;
        return true;
    }
    static boolean isZero(int k, int[] nums, int[][] qrs)
    {
        int n = nums.length;
        int[] rec = new int[n+1];
        for(int i=0; i<=k; i++)
        {
            rec[qrs[i][0]] += qrs[i][2];
            rec[qrs[i][1]+1] -= qrs[i][2];
        }

        if(nums[0]>rec[0]) return false;
        for(int i=1; i<n; i++)
        {
            rec[i]+=rec[i-1];
            if(nums[i]>rec[i]) return false;
        }
        return true;
    }
    public int minZeroArray(int[] nums, int[][] qrs) 
    {
        if(check(nums)) return 0;

        int l=0, r=qrs.length-1, m=0, ans = -2;
        while(l<=r)
        {
            m = (l+r)/2;
            if(isZero(m,nums,qrs)){
                ans = m;
                r = m-1;
            }
            else
                l = m+1;
        }
        return ans+1;
    }
}