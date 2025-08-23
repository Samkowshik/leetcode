class Solution {
    public long zeroFilledSubarray(int[] nums) 
    {
        long ans = 0, c = 0;
        for(int i : nums)
        {
            if(i == 0) c++;
            else c = 0;
            ans += c;
        }

        return ans;
        
    }
}