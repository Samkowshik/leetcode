class Solution 
{
    public int longestSquareStreak(int[] nums) 
    {
        Arrays.sort(nums);

        int n = nums.length, ans = 0;
        boolean vis[] = new boolean[n];
        for(int i=0; i<n; i++)
        {
            if(vis[i]) continue;
            int t = nums[i]*nums[i], c = 1, j = i+1;
            while(true)
            {
                j = Arrays.binarySearch(nums, j, n, t);
                if(j<0) break;
                t = nums[j]*nums[j];
                vis[j] = true;
                c++;
            }

            ans = Math.max(ans, c);
        }

        return ans == 1? -1: ans;
    }
}