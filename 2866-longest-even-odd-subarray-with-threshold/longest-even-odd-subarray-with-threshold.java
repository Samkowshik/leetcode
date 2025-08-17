class Solution 
{
    public int longestAlternatingSubarray(int[] nums, int threshold) 
    {
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] > threshold)
            nums[i] = -1;
            else
            nums[i] %= 2;
        }
        
        int ind = 0, len = 0, max = -1;
        while(ind < n)
        {
            while(ind < n && Math.abs(nums[ind]) == 1) ind++;

            while(ind < n && nums[ind] == len%2){
                ind++;
                len++;
                max = Math.max(max, len);
            }
            len = 0;
        }

        return max == -1 ? 0 : max;
    }
}