class Solution 
{
    public int maximumUniqueSubarray(int[] nums) 
    {
        int[] map = new int[10001];
        int j = 0, sum = 0, max = 0;
        for(int i : nums)
        {
            while(map[i]==1){
                sum -= nums[j];
                map[nums[j]]--;
                j++;
            }
            map[i] = 1;
            sum += i;
            max = Math.max(max, sum);
        }
        return max;
    }
}