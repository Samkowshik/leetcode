class Solution {
    public int[] resultsArray(int[] nums, int k) 
    {
        if(k==1) return nums;

        int n = nums.length;
        int[] ans = new int[n-k+1];
        Arrays.fill(ans,-1);

        int c = 0, p = nums[0]-1;
        for(int i=0; i<n; i++)
        {
            if(nums[i] == p+1) c++;
            else c = 1;
            
            if(c>=k) ans[i-k+1] = nums[i];

            p = nums[i];
        }
        return ans;
    }
}