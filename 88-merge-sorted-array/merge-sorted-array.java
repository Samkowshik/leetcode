class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int l = m+n-1;
        m--; n--;
        while(l>=0)
        {
            if(n<0 ||(m>=0 && nums1[m]>=nums2[n]))
                nums1[l--] = nums1[m--];
            else nums1[l--] = nums2[n--];
        }
    }
}