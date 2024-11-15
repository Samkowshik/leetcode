class Solution 
{
    static int findIndRight(int[] nums, int t, int l, int r)
    {
        int ind = nums.length;
        while(l<=r)
        {
            int m = (l+r)/2;
            if(nums[m] >= t){
                ind = m;
                r = m-1;
            }
            else l = m+1;
        }

        return ind;
    }
    static int findIndLeft(int[] nums, int t, int l, int r)
    {
        int ind = -1;
        while(l<=r)
        {
            int m = (l+r)/2;
            if(nums[m] <= t){
                ind = m;
                l = m+1;
            }
            else r = m-1;
        }

        return ind;
    }

    public int findLengthOfShortestSubarray(int[] nums) 
    {
        int p, n = nums.length, i=1, j=n-2;

        p = nums[0];
        while(i<n && nums[i]>=p) p=nums[i++];
        if(i==n) return 0;

        p = nums[n-1];
        while(j>-1 && nums[j]<=p) p=nums[j--];


        int ans = n, ind, dell;
        for(int k=0; k<i; k++)
        {
            ind = findIndRight(nums, nums[k], j+1, n-1);
            dell = ind-k-1;
            ans = Math.min(ans,dell);
        }
        for(int k=j+1; k<n; k++)
        {
            ind = findIndLeft(nums, nums[k], 0, i-1);
            dell = k-ind-1;
            ans = Math.min(ans,dell);
        }

        return ans;
        
    }
}