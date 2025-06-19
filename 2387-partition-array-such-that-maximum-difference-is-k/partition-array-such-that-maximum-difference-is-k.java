class Solution 
{
    public int partitionArray(int[] nums, int k) 
    {
        int n = nums.length, ans = 0;
        Arrays.sort(nums);
        for(int i=0; i<n;)
        {
            int j = i;
            while(i<n && nums[i]-nums[j]<=k) i++;
            ans++;
        }
        return ans;
    }
}