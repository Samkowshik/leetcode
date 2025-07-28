class Solution {
    public int longestSubarray(int[] nums) 
    {
        int max = 0, ans = 1, n = nums.length;

        for(int i=0; i<n;)
        {
            int j = i;
            while(i<n && nums[j] == nums[i]) i++;
            if(nums[j] > max){
                max = nums[j];
                ans = i-j;
            }
            else if(nums[j] == max)
                ans = Math.max(ans, i-j);
        }
        return ans;
    }
}