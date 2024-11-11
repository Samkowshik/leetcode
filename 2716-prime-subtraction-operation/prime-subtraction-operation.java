class Solution 
{
    static boolean[] sev;
    static void buildSev()
    {
        sev[0] = true; sev[1] = true;
        for(int i=2; i<1001; i++)
            if(!sev[i])
                for(int j = i*2; j<1001; j+=i)
                    sev[j] = true;
    }

    static int findInd(int[] nums, int i)
    {
        for(; i>0; i--)
        {
            if(nums[i] <= i) 
                return -2;
            if(nums[i-1] >= nums[i]) 
                return i-1;
        }
        return -1;
    }

    static int update(int[] nums, int ind)
    {
        int i = nums[ind]-nums[ind+1]+1;
        for(; i < nums[ind]; i++)
            if(!sev[i])
                return nums[ind] - i;
        return -1;
    }

    public boolean primeSubOperation(int[] nums) 
    {
        sev = new boolean[1001];
        buildSev();

        for(int i=nums.length-1; i>0;)
        {
            i = findInd(nums, i);
            if(i<0) return i == -1;

            nums[i] = update(nums,i);
            if(nums[i] == -1) return false;

        }

        return true;
    }
}