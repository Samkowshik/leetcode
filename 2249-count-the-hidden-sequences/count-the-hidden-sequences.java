class Solution 
{
    public int numberOfArrays(int[] nums, int lower, int upper) 
    {
        double min = 0, max = 0, s = 0;
        for(int i : nums)
        {
            s+=i;
            min = Math.min(min, s);
            max = Math.max(max, s);
        }
        upper -= max;
        lower -= min;
        if(lower>upper) return 0;
        return upper-lower+1;
    }
}