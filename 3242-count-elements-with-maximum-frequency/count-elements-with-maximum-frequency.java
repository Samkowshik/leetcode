class Solution {
    public int maxFrequencyElements(int[] nums) 
    {
        int mf = 0, ans = 0;
        int[] map = new int[101];
        for(int i: nums){
            map[i]++;
            if(map[i] > mf){
                mf = map[i];
                ans = mf;
            }
            else if(map[i] == mf)
            ans += mf;
        }
        return ans;
    }
}