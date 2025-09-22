class Solution {
    public int maxFrequencyElements(int[] nums) 
    {
        int mf = 0, ans = 0;
        int[] map = new int[101];
        for(int i: nums)
            mf = Math.max(mf, ++map[i]);
        for(int i : map)
            if(i == mf)
                ans += i;
        return ans;
    }
}