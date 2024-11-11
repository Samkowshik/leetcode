class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) 
    {
        int n = nums.size();
        int[] streak = new int[n];
        int c = 0, prev = -10000;
        for(int i=0; i<n; i++)
        {
            int cur = nums.get(i);
            c = cur > prev ? c+1 : 1;
            streak[i] = c;

            if(i>=k*2-1 && streak[i-k]>=k && streak[i]>=k)
                return true;

            prev = cur;
        }
        return false;
    }
}