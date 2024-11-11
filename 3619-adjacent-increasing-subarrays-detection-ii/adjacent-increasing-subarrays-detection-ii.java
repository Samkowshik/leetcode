class Solution 
{
    static int findStreak(List<Integer> nums, int n, int i)
    {
        while(i<n-1 && nums.get(i) < nums.get(i+1)) {i++;}
        return i+1;
    }
    public int maxIncreasingSubarrays(List<Integer> nums) 
    {
        int n = nums.size(), j = findStreak(nums,n,0), streak = j, ans = j/2;
        
        for(int i=j; i<n; i=j)
        {
            j = findStreak(nums,n,i);
            ans = Math.max(ans, (j-i)/2);
            ans = Math.max(ans, Math.min(streak, j-i));
            streak = j-i;
        }

        return ans;
    }
}