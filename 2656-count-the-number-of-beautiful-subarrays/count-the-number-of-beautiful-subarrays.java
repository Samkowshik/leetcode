class Solution {
    public long beautifulSubarrays(int[] nums) 
    {
        long ans = 0;
        int x = 0;
        int[] arr = new int[10000001];
        arr[0]++;
        for(int i: nums)
        {
            x ^=i;
            ans += arr[x]++;
        }
        return ans;
        
    }
}