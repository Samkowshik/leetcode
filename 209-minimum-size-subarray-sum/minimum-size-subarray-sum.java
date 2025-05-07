class Solution 
{
    public int minSubArrayLen(int t, int[] nums) 
    {
        int i=0, j=0, n = nums.length, sum = 0, ans = n+1;
        while(j<n)
        {
            while(sum<t && j<n){
                sum+=nums[j];
                j++;
            }
            while(sum>=t && i<=j){
                ans = Math.min(ans, j-i);
                sum-= nums[i];
                i++;
            }
        }
        return ans==n+1?0:ans;
    }
}