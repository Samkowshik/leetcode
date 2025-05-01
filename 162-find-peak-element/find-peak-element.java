class Solution 
{
    public int findPeakElement(int[] nums) 
    {
        int l = 0, n = nums.length-1, r=n, m=0;
        if(n==0) return 0;
        while(l<=r)
        {
            m=(l+r)/2;
           if((m==0 && nums[m+1]<nums[m]) || (m==n && nums[m-1]<nums[m]) || (m>0 && m<n && nums[m-1]<nums[m] && nums[m+1]<nums[m]))
            return m;

            if(m!=0 && nums[m-1]>nums[m])
            r = m-1;
            else
            l = m+1;
        }
        return 0;
    }
}