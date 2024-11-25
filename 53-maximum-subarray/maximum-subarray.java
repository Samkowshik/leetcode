class Solution {
    public int maxSubArray(int[] nums) 
    {
        int ans = 0, s =0;
        for(int i: nums) {
            s+=i;
            ans = Math.max(ans,s);
            if(s<0) s=0;
        }
        if(ans == 0)
        {
            ans = -100000;
            for(int i: nums)
            ans = Math.max(ans,i);
        }

        return ans;
    }
}