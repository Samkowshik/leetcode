class Solution 
{
    static int rightneg(int[] nums)
    {
        int n = nums.length,pos = -1, l=0,r=n-1,m=0;
        while(l<=r){
            m = (l+r)/2;
            if(nums[m]<0){
                pos = m;
                l = m+1;
            }
            else
            r=m-1;
        }
        return pos+1;
    }
    static int leftpos(int[] nums)
    {
        int n = nums.length,pos = n, l=0,r=n-1,m=0;
        while(l<=r){
            m = (l+r)/2;
            if(nums[m]>0){
                pos = m;
                r = m-1;
            }
            else
            l=m+1;
        }
        return n-pos;
    }
    public int maximumCount(int[] nums) 
    {
        return Math.max(rightneg(nums), leftpos(nums));
    }
}