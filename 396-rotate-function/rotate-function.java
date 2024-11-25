class Solution {
    public int maxRotateFunction(int[] nums) 
    {

        int n = nums.length, sum = 0;

        if(n==1) return 0;

        int[] pre = new int[n];
        int[] suf = new int[n];
        pre[0] = nums[0];
        suf[n-1] = nums[n-1];

        for(int i=1; i<n; i++){
            sum+=nums[i]*i;
            pre[i] = pre[i-1]+nums[i];
        }
        for(int i=n-2; i>=0; i--)
            suf[i] = suf[i+1]+nums[i];

        int ans = sum;
        sum+=pre[n-2] - nums[n-1]*(n-1);
        ans = Math.max(ans, sum);

        for(int i=n-2; i>0; i--)
        {
            sum-=nums[i]*(n-1);
            sum+=pre[i-1]+suf[i+1];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}