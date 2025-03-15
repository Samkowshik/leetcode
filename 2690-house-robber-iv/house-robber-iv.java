class Solution 
{
    static boolean check(int m, int k, int[] nums)
    {
        for(int i=0; k>0 && i<nums.length; i++)
        {
            if(nums[i]<=m){
                k--;
                i++;
            }
        }
        return k==0;
    }

    public int minCapability(int[] nums, int k) 
    {
        int min=nums[0], max = 0, m = 0, ans = 0;
        for(int i : nums){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        
        while(min<=max)
        {
            m = (min+max)/2;
            if(check(m,k,nums)){
                ans = m;
                max = m-1;
            }
            else 
                min = m+1;
        }
        return ans;
    }
}