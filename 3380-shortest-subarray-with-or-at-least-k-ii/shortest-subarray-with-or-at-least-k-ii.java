class Solution 
{

    static int[] bin;
    static void add(int n)
    {
        for(int i=0; n>0; i++, n>>=1)
            if((n&1)==1)
                bin[i]++;
    }
    static int remove(int n, int or)
    {
        for(int i=0; n>0; i++, n>>=1)
            if((n&1)==1)
                if(--bin[i] == 0)
                    or^=(1<<i);
        return or;
    }

    public int minimumSubarrayLength(int[] nums, int k) 
    {
        if (k==0) return 1;

        bin = new int[31];
        int ans = Integer.MAX_VALUE, or = 0, j=0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>=k) return 1;

            or |= nums[i];
            add(nums[i]);

            for(; or >= k; j++)
            {
                ans = Math.min(i-j+1, ans);

                int tor = remove(nums[j], or);
                if(tor < k) {
                    add(nums[j]);
                    break;
                }
                or = tor;
            }
        }
        return ans==Integer.MAX_VALUE ? -1: ans;
        
    }
}