class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int pro = 1, n = nums.length, z = 0, ind = -1;
        int[] ans = new int[n];
        Arrays.fill(ans,0);
        
        for(int i=0; i<n; i++)
        {
            if(nums[i]==0) 
            {
                if(z == 1) 
                    return ans;
                z++;
                ind = i;
            }
            else
                pro*=nums[i];
        }

        if(z==1)
            ans[ind] = pro;
        else
            for(int i=0; i<n; i++) 
                ans[i] = pro/nums[i];

        return ans;
    }
}